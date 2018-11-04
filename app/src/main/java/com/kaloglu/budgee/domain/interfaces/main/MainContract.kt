package com.kaloglu.budgee.domain.interfaces.main

import com.kaloglu.budgee.domain.interfaces.base.mvp.BasePresenter
import com.kaloglu.budgee.domain.interfaces.base.mvp.BaseView

interface MainContract {

    interface View : BaseView {
        fun setNavigationOnClick(onClick: (android.view.View) -> Unit)
    }

    interface Presenter : BasePresenter<View>
}
