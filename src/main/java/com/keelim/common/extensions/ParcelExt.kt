package com.keelim.common.extensions

import android.content.Intent
import android.os.Build.VERSION.SDK_INT
import android.os.Bundle

inline fun <reified T> Intent.getParcel(key: String, clazz: Class<T>): T? = when {
    SDK_INT >= 33 -> getParcelableExtra(key, clazz)
    else -> @Suppress("DEPRECATION") getParcelableExtra(key) as? T
}

inline fun <reified T> Bundle.getParcel(key: String, clazz: Class<T>): T? = when {
    SDK_INT >= 33 -> getParcelable(key, clazz)
    else -> @Suppress("DEPRECATION") getParcelable(key) as? T
}
