package com.example.appupdate

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.appupdate.ui.theme.AppUpdateTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            AppUpdateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        var myTextfieldvalues by remember {
                            mutableStateOf("")
                        }
                    Column(modifier = Modifier
                        .background(color = Color.LightGray)
                        .padding(top = Dp(50F)),
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        TextField(value = myTextfieldvalues, onValueChange = {
                            myTextfieldvalues = it
                            Log.i("###", it)
                        })
                    }
                    Text(text = "$myTextfieldvalues")
                    }
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppUpdateTheme {
    }
}