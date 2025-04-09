package com.example.dolldressup.model

import androidx.compose.runtime.mutableStateListOf
import com.example.dolldressup.R

object ImageListFactory {
    fun makeImageList()= mutableStateListOf(
        ImageData(imgUri = R.drawable.body, checked = true),
        ImageData(imgUri = R.drawable.eyes, checked = true),
        ImageData(imgUri = R.drawable.eyebrows, checked = true),
        ImageData(imgUri = R.drawable.ears, checked = true),
        ImageData(imgUri = R.drawable.glasses, checked = true),
        ImageData(imgUri = R.drawable.mouth, checked = true),
        ImageData(imgUri = R.drawable.nose, checked = true),
        ImageData(imgUri = R.drawable.mustache, checked = true),
        ImageData(imgUri = R.drawable.hat, checked = true),
        ImageData(imgUri = R.drawable.arms, checked = true),
        ImageData(imgUri = R.drawable.shoes, checked = true),
    )
}