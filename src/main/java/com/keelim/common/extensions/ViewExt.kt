package com.keelim.common.extensions

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.activity.compose.BackHandler
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.launch

fun View.toVisible(){
    visibility = View.VISIBLE
}

fun View.toGone(){
    visibility = View.GONE
}

fun View.toInvisible(){
    visibility = View.INVISIBLE
}

fun Context.snack(view:View, message:String) {
    Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
}

fun Context.snack(view:View, @StringRes message:Int) {
    Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
}
