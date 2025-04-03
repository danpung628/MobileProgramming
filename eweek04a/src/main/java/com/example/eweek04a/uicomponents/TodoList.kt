package com.example.eweek04a.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.eweek04a.model.Item
import com.example.eweek04a.model.TodoStatus

@Composable
fun TodoList(todoList: MutableList<Item>, modifier: Modifier = Modifier, checked: Boolean) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(scrollState)
    ) {

        val filteredList = if(checked){
            todoList.filter { it.status== TodoStatus.PENDING }
        } else todoList

        filteredList.forEachIndexed { index, item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp, horizontal = 2.dp)
            ) {
                Row {
                    TodoCheckBox(checked = item.status == TodoStatus.COMPLETED) { isChecked ->

                        val updateItem = item.copy(
                            status = if (isChecked) TodoStatus.COMPLETED
                            else TodoStatus.PENDING
                        )
                        todoList[todoList.indexOf(item)] = updateItem
                    }
                    TodoItem(item = item)
                }
            }
        }
    }
}

//@Preview
//@Composable
//private fun TodoListPreview() {
//    TodoList(TodoItemFactory.makeTodoList())
//}