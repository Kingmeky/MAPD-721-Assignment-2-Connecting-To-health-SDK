package com.example.mapd_721_assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.mapd_721_assignment2.ui.theme.MAPD_721_Assignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    val context = LocalContext.current


    // State for input fields
    var heartrate by remember { mutableStateOf("") }
    var date by remember { mutableStateOf("") }
    var savedData by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Input fields
        OutlinedTextField(
            value = heartrate,
            onValueChange = { heartrate = it },
            label = { Text("Heart Rate") }
        )
        OutlinedTextField(
            value = date,
            onValueChange = { date = it },
            label = { Text("Date/Time") }
        )

        // Buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(100.dp), // Increase or decrease the spacing as desired
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    // Handle Save button click
                    // For example, you can update savedData here
                    savedData = "$heartrate - $date"
                },
                modifier = Modifier
                    .height(48.dp) // Set the height of the button
                    .width(120.dp) // Set the width of the button
                    .background(color = Color.Red) // Set the background color of the button
            ) {
                Text("Save")
            }
            Button(
                onClick = {
                    // Handle Load button click
                    // For example, you can load data here
                },
                modifier = Modifier
                    .height(48.dp) // Set the height of the button
                    .width(120.dp) // Set the width of the button
                    .background(color = Color.Blue, shape = MaterialTheme.shapes.small) // Set the background color of the button
            ) {
                Text("Load")
            }
        }




    }}