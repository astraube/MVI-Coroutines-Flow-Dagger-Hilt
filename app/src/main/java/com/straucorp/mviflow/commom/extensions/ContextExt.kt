package com.straucorp.mviflow.commom.extensions

import android.content.Context
import android.widget.Toast

/**
 * Context Extensions and derived components
 */
fun Context.toast(text: CharSequence) = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()