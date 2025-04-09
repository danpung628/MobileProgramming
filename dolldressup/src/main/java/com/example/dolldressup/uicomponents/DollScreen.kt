package com.example.dolldressup.uicomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.dolldressup.model.ImageData


@Composable
fun DollScreen(modifier: Modifier = Modifier, imageList: MutableList<ImageData>) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        imageList.forEachIndexed { index, imageData ->
            if (imageData.checked) {
                Image(
                    painter = painterResource(id = imageData.imgUri),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}