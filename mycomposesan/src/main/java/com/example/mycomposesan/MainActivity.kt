package com.example.mycomposesan

import android.icu.text.CaseMap
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.example.mycomposesan.ui.theme.ComposeNavigationTheme
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {
                // A surface container using the 'background' color from the theme

                    //MyScreen()
                    var expanded by remember {
                        mutableStateOf(false)
                    }
                    ExpandCard(
                        expanded,
                        "Hello",
                        "111111111111111111111111111122222222222222222222222222223333333333333333333333444444444444444444444555555555555555555555555566666666666666667777777777777777777777888888888888888888888999999999999999999999999990000000000000",
                        onTextExpand = {
                            expanded = it
                        }
                    )
                    Button(onClick = { expanded = !expanded })
                    {
                        Text(text = "Submit")
                    }
            }
        }
    }
}

@Composable
fun MyScreen(viewModel: MyViewModel = MyViewModel()) {
    val userName: String by viewModel.name.observeAsState("")
    UserNameFields(userName = userName, getUserName =
    {
        Log.i("--", userName)
        viewModel.onNameChanged(it)
    })
}

@Composable
fun UserNameFields(userName: String, getUserName: (String) -> Unit) {
    TextField(value = userName, onValueChange = getUserName, label = { Text(text = "UserName") })
}

class MyViewModel : ViewModel() {
    private val _name = MutableLiveData("")
    val name: LiveData<String> = _name

    fun onNameChanged(changedName: String) {
        Log.i("**", changedName)
        _name.value = changedName
    }

}


@Composable
fun ExpandCard(expand:Boolean, title: String, body: String, onTextExpand: (Boolean) -> Unit) {
    Card {
        Column {
            Text(text = title)
            if (expand) {
                Text(text = body)
                IconButton(onClick = {
                    onTextExpand(true)
                }) {
                    Icon(Icons.Default.Add, contentDescription = "Expand")
                }
            } else {
                IconButton(onClick = {
                    onTextExpand(true)
                }) {
                    Icon(Icons.Default.Check, contentDescription = "Expand")
                }
            }
        }
    }
}

