package com.hazz.kotlinmvp.net.exception

/**
 * Created by zcq on 2017/12/5.
 * desc:
 */
class ApiException : RuntimeException {

    private var code: Int? = null


    constructor(throwable: Throwable, code: Int) : super(throwable) {
        this.code = code
    }

    constructor(message: String) : super(Throwable(message))
}