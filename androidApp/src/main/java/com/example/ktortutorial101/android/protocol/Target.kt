package com.example.ktortutorial101.android.protocol

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import com.squareup.picasso.Picasso.LoadedFrom


interface Target {
    fun onBitmapLoaded(var1: Bitmap?, var2: LoadedFrom?)
    fun onBitmapFailed(var1: Exception?, var2: Drawable?)
    fun onPrepareLoad(var1: Drawable?)
}