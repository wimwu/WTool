package com.wim.tool.ui.mine

import androidx.lifecycle.*
import com.tencent.mmkv.MMKV
import com.wim.tool.USER_ID
import com.wim.tool.data.entity.User
import com.wim.tool.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MineViewModel @Inject constructor(val repository: UserRepository): ViewModel() {

    val userId = MMKV.defaultMMKV().decodeString(USER_ID)

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
    var user: LiveData<User>? = null

    init {
        viewModelScope.launch {
            user = userId?.let { repository.getUser(it).asLiveData() }
        }
    }

}