package com.example.dolldressup.uicomponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.dolldressup.model.ImageData

@Composable
fun ShowCheckBox(imageList: MutableList<ImageData>, modifier: Modifier = Modifier) {
    imageList.forEachIndexed { index,imageData ->
        Text(imageData.imgName)
        ClothesCheckBox(imageData.checked) { isChecked->
            imageList[index] = imageData.copy(checked = isChecked)
        }
    }
}