package com.example.eweek04a.uicomponents

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eweek04a.model.Item
import com.example.eweek04a.model.TodoItemFactory
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun TodoItemInput(todoList: MutableList<Item>, modifier: Modifier = Modifier) {
    var textFieldState by remember { mutableStateOf("") }
    Row (verticalAlignment = Alignment.CenterVertically,modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)){
        TextField(
            value = textFieldState,
            onValueChange = { text: String -> textFieldState = text },
            placeholder = { Text("할 일을 입력하세요.") },
        )
        Button(modifier= Modifier.padding(horizontal = 8.dp),onClick = {
            if (textFieldState != "") {
                val currentTime = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("MM-dd HH:mm"))
                todoList.add(Item(textFieldState, currentTime)) // todolist에 추가
            }
        }) { Text("추가") }
    }
}

@Preview
@Composable
private fun TodoItemInputPreview() {
    TodoItemInput(TodoItemFactory.makeTodoList())
}