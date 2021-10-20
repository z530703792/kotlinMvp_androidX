package com.hazz.kotlinmvp.ui.fragment

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import com.hazz.kotlinmvp.R
import com.hazz.kotlinmvp.base.BaseFragment
import kotlinx.android.synthetic.main.activity_profile_homepage.*

/**
 * Created by PPT on 2021/10/19
 */
class MainFragment : BaseFragment() {
    private var mTitle: String? = null

    companion object {
        fun getInstance(title: String): MainFragment {
            val fragment = MainFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }

    //by lazy  初始化第一次使用  只能用在val类型
    private val linearLayoutManager by  lazy{
         LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
    }

    override fun getLayoutId(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return R.layout.fragment_main
    }

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lazyLoad() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}