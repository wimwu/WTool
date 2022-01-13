package com.wim.tool.http

import android.content.Context
import androidx.lifecycle.Observer
import coil.request.Disposable
import com.squareup.moshi.Moshi
import retrofit2.HttpException
import java.net.SocketTimeoutException


/**
 * @author wim
 * @date 2021/10/25
 */
abstract class ApiResponse<T>(private val context: Context) : Observer<T> {
    abstract fun success(data: T)
    abstract fun failure(statusCode: Int, apiErrorModel: ApiErrorModel)

    fun onSubscribe(d: Disposable) {
//        LoadingDialog.show(context)
    }

    fun onNext(t: T) {
        success(t)
    }

    fun onComplete() {
//        LoadingDialog.cancel()
    }

    fun onError(e: Throwable) {
//        LoadingDialog.cancel()
        if (e is HttpException) { //连接服务器成功但服务器返回错误状态码
            val apiErrorModel: ApiErrorModel = when (e.code()) {
                ApiErrorType.SERVICE_ERROR.code ->
                    ApiErrorType.SERVICE_ERROR.getApiErrorModel(context)
                ApiErrorType.NOT_FOUND.code ->
                    ApiErrorType.NOT_FOUND.getApiErrorModel(context)
                else -> ApiErrorType.UNEXPECTED_ERROR.getApiErrorModel(context)

            }
            failure(e.code(), apiErrorModel)
            return
        }

        val apiErrorType: ApiErrorType = when (e) {  //发送网络问题或其它未知问题，请根据实际情况进行修改
            is SocketTimeoutException -> ApiErrorType.CONNECTION_TIMEOUT
            else -> ApiErrorType.UNEXPECTED_ERROR
        }
        failure(apiErrorType.code, apiErrorType.getApiErrorModel(context))
    }

    private fun otherError(e: HttpException) =
        Moshi.Builder().build().adapter(ApiErrorModel::class.java).fromJson(e.response().toString())
}