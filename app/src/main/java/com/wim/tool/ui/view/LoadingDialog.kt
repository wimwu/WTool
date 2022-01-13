package com.wim.tool.ui.view

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Handler
import android.os.Looper

import android.view.LayoutInflater
import android.view.View
import android.view.Window

import com.wim.tool.R

import android.view.WindowManager


/**
 * @author wim
 * @date 2021/12/1
 */
@SuppressLint("InflateParams")
class LoadingDialog(context: Context) : Dialog(context) {

    private val minShowTime: Long = 500
    private val minDelay: Long = 500

    private var startTime: Long = -1
    private var postedHide = false
    private var postedShow = false
    private var dismissed = false

    private val mHandler: Handler = Handler(Looper.getMainLooper())

    private val mDelayedHide = Runnable {
        postedHide = false
        startTime = -1
        dismiss()
    }

    private val mDelayedShow = Runnable {
        postedShow = false
        if (!dismissed) {
            startTime = System.currentTimeMillis()
            show()
        }
    }

    init {
        val loadView: View = LayoutInflater.from(context).inflate(R.layout.dialog_loading, null)
        setContentView(loadView)
        val window: Window? = window
        window!!.setBackgroundDrawableResource(android.R.color.transparent)
        val lp: WindowManager.LayoutParams = window.attributes
        lp.alpha = 1.0f
        lp.dimAmount = 0.0f //dimAmount在0.0f和1.0f之间，0.0f完全不暗，1.0f全暗

        val displayMetrics = context.resources.displayMetrics
        lp.width = (displayMetrics.widthPixels * 0.5).toInt()

        window.attributes = lp
        setCancelable(false)
    }

    fun showDialog() {
        startTime = -1
        dismissed = false
        mHandler.removeCallbacks(mDelayedHide)
        postedHide = false
        if (!postedShow) {
            mHandler.postDelayed(mDelayedShow, minDelay)
            postedShow = true
        }
    }

    fun hideDialog() {
        dismissed = true
        mHandler.removeCallbacks(mDelayedShow)
        postedShow = false
        val diff = System.currentTimeMillis() - startTime
        if (diff >= minShowTime || startTime == -1L) {
            dismiss()
        } else {
            if (!postedHide) {
                mHandler.postDelayed(mDelayedHide, minShowTime - diff)
                postedHide = true
            }
        }
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        mHandler.removeCallbacks(mDelayedHide)
        mHandler.removeCallbacks(mDelayedShow)
    }


}