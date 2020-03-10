package com.ziad.base

abstract class AbsPresenter<V> {

    var mView: V? = null

    fun attachView(view: V) {
        this.mView = view
        setObservers()
        doOnAttach()
    }

    fun deAttachView() {
        this.mView = null
    }

    abstract fun setObservers()

    open fun doOnAttach() {}
}