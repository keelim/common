package com.keelim.common.extensions

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment

inline fun <reified T : Activity> Context.buildIntent(
    vararg argument: Pair<String, Any?>
): Intent = Intent(this, T::class.java).apply {
    putExtras(bundleOf(*argument))
}

inline fun <reified T : Activity> Context.startActivity(
    vararg argument: Pair<String, Any?>
) {
    startActivity(buildIntent<T>(*argument))
}

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun Context.toast(@StringRes message:Int, duration:Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, message, duration).show()
}

fun Fragment.toast(message:String, duration:Int = Toast.LENGTH_SHORT){
    Toast.makeText(requireContext(), message, duration).show()
}

fun Fragment.toast(@StringRes message:Int, duration:Int = Toast.LENGTH_SHORT){
    Toast.makeText(requireContext(), message, duration).show()
}

@Px
fun Context.dip(dipValue: Float) = (dipValue * resources.displayMetrics.density).toInt()

