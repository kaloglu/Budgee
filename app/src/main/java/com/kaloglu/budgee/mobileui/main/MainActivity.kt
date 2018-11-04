package com.kaloglu.budgee.mobileui.main

import android.content.Context
import android.content.Intent
import android.support.annotation.StringRes
import android.view.View
import com.kaloglu.budgee.R
import com.kaloglu.budgee.domain.interfaces.main.MainContract
import com.kaloglu.budgee.mobileui.base.BaseFragment
import com.kaloglu.budgee.mobileui.base.mvp.BaseMvpActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseMvpActivity<MainContract.Presenter>(),
        MainContract.View {

    override val contentResourceId = R.layout.activity_main

    override val baseFrameLayoutId = R.id.activity_fragment_container

    //TODO: add a fragment for initial if you need
    override val containedFragment: BaseFragment? = null

    override fun initUserInterface() {
        setSupportActionBar(toolbar)
        toolbar.title = title

//        setNavigationOnClick {
//            onBackPressed()
//        }
    }


    override fun setSupportActionBar(toolbar: android.support.v7.widget.Toolbar?) {
        super.setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun setNavigationOnClick(onClick: (View) -> Unit) = Unit
    //            toolbar?.setNavigationOnClickListener {
//                onClick(it)
//            } ?: Unit
//
    override fun setTitle(@StringRes resId: Int) = setTitle(getString(resId))

    internal fun setTitle(string: String) {
        supportActionBar?.title = string
    }

    companion object {

        @JvmStatic
        fun newIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
    }

}
