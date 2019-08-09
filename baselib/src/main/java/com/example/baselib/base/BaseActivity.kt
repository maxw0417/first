package com.example.baselib.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var layoutResId = getLayoutResId()
        if (layoutResId > 0) {
            setContentView(layoutResId);
        }

        initView()


    }

    open fun getLayoutResId(): Int {
        return 0
    }

    open fun initView(){}


}