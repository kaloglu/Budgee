package com.kaloglu.budgee.domain.main

import com.kaloglu.budgee.domain.interfaces.main.MainContract
import com.kaloglu.budgee.mobileui.base.mvp.BaseAbstractPresenter
import javax.inject.Inject

class MainPresenter @Inject constructor()
    : BaseAbstractPresenter<MainContract.View>(), MainContract.Presenter