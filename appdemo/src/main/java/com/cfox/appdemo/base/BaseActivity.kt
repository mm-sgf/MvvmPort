package com.cfox.appdemo.base

import androidx.databinding.ViewDataBinding
import com.cfox.mvvmprot.base.MPActivity
import com.cfox.mvvmprot.base.viewmodel.MPSViewModel

abstract class BaseActivity<V : ViewDataBinding, VM : BaseViewModel<*>> : ShareActivity<V, VM, MPSViewModel>() {

}