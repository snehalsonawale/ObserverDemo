package com.example.observerdemo

import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.observerdemo.ui.theme.ObserverDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ObserverDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }

        lifecycle.addObserver(Observer())


        Log.d("%%%MAIN","Activity-Oncreate")
    }

    override fun onPause() {
        super.onPause()
        Log.d("%%%MAIN","Activity-onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("%%%MAIN","Activity-onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("%%%MAIN","Activity-onDestroy")
    }


    override fun onStart() {
        super.onStart()
        Log.d("%%%MAIN","Activity-onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("%%%MAIN","Activity-onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("%%%MAIN","Activity-onResume")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ObserverDemoTheme {
        Greeting("Android")
    }
}