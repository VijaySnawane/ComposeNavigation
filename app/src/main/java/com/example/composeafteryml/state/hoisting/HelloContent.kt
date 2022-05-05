package com.example.composeafteryml.state.hoisting

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
// for a 'val' variable
import androidx.compose.runtime.getValue
// for a `var` variable also add
import androidx.compose.runtime.setValue

@Composable
fun HelloScreen() {
    var userName by rememberSaveable { mutableStateOf("") }
    UserName(userName = userName, onUserNameChanged = { userName = it })
}

@Composable
fun UserName(userName: String, onUserNameChanged: (String) -> Unit) {
    Column(modifier = Modifier.padding(15.dp)) {
        Text(text = "Hello, $userName",
            modifier = Modifier.padding(10.dp),
            style = MaterialTheme.typography.h1)
        OutlinedTextField(value = userName,
            onValueChange = onUserNameChanged,
            label = { Text("Name") })
    }
}




