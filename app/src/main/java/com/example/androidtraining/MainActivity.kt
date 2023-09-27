package com.example.androidtraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidtraining.ui.theme.AndroidTrainingTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidTrainingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.border(border = 4.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(20.dp)
                                .fillMaxWidth(),

                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    fontSize = 32.sp,
                                    text = "Sign Up",
                                    fontWeight = FontWeight(600)
                                )
                                Text(fontSize = 16.sp, text = "It's quick and easy")
                            }
                            Text(text = "X")
                        }
                        Divider()
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(20.dp)
                        ) {
                            var a by remember {
                                mutableStateOf(value = "")
                            }
                            var b by remember {
                                mutableStateOf(value = "")
                            }

                            Row {
                                TextField(
                                    value = a,
                                    onValueChange = { a = it },
                                    placeholder = {
                                        Text(
                                            text = "First Name"
                                        )
                                    },
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(4.dp)
                                )
                                TextField(
                                    value = a,
                                    onValueChange = { a = it },
                                    placeholder = {
                                        Text(
                                            text = "Surname"
                                        )
                                    },
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(4.dp)
                                )
                            }
                            TextField(
                                value = b,
                                onValueChange = { b = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(4.dp),
                                placeholder = {
                                    Text(
                                        text = "Mobile Number or email address"
                                    )
                                }
                            )
//                            Image(
//                                painterResource(id = R.drawable.maki), contentDescription = ""
//                            )
                            TextField(
                                value = b,
                                onValueChange = { b = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(4.dp),

                                placeholder = {
                                    Text(
                                        text = "password"
                                    )
                                }
                            )
                            Text(
                                fontSize = 16.sp,
                                text = "Date of birth",
                                textAlign = TextAlign.Start,
                                modifier = Modifier.fillMaxWidth()
                            )
                            Row {
                                TextField(
                                    value = a,
                                    onValueChange = { a = it },
                                    placeholder = {
                                        Text(
                                            text = "26"
                                        )
                                    },
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(4.dp)
                                )
                                TextField(
                                    value = a,
                                    onValueChange = { a = it },
                                    placeholder = {
                                        Text(
                                            text = "Sep"
                                        )
                                    },
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(4.dp)
                                )
                                TextField(
                                    value = a,
                                    onValueChange = { a = it },
                                    placeholder = {
                                        Text(
                                            text = "2023"
                                        )
                                    },
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(4.dp)
                                )
                            }

                            Text(
                                fontSize = 12.sp,
                                lineHeight = 10.sp,
                                text = "People who use our service may have uploaded your contact information to the Facebook. Learn More"
                            )
                            Text(
                                fontSize = 12.sp,
                                lineHeight = 10.sp,
                                modifier = Modifier.padding(bottom = 10.dp),
                                text = "By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. You may receive SMS notification from us and can opt out at any time"
                            )
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color(0xFF358856)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Text(text = "Sign Up")

                            }


                        }
                    }
                }
            }
        }
    }
}

