package com.celly.swaggy.ui.theme.screens.form

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.celly.swaggy.R
import com.celly.swaggy.navigation.ROUT_ITEM
import com.celly.swaggy.ui.theme.burntorange
import com.celly.swaggy.ui.theme.emarald
import com.celly.swaggy.ui.theme.newgreen


@Composable
fun FormScreen(navController: NavController){
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }


    Column (
        modifier = Modifier.fillMaxSize().background(burntorange),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){


        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.ecommerce))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )
        //End of Animation

        Spacer(modifier = Modifier.height(10.dp))




           //Card

           Card (
               modifier = Modifier.fillMaxWidth().height(800.dp),
               shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp)
           ){
               Column (
                   horizontalAlignment = Alignment.CenterHorizontally
               ){
                   Text(
                       text = "Swaggy",
                       fontSize = 40.sp,
                       color = burntorange,
                       fontFamily= FontFamily.Cursive,
                       fontWeight = FontWeight.Bold
                   )

                   Spacer(modifier = Modifier.height(10.dp))

                   Text(
                       text = "Join Us and start your journey today",
                       fontSize = 15.sp,
                   )

                   Spacer(modifier = Modifier.height(10.dp))

                   //Username

                   OutlinedTextField(
                       value = username,
                       onValueChange = {username=it},
                       modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                       leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
                       label = { Text(text = "Username") },
                       colors = OutlinedTextFieldDefaults.colors(
                           unfocusedBorderColor = emarald,
                           focusedBorderColor = Color.Black,
                           unfocusedLeadingIconColor = newgreen

                       ),
                       keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

                   )
                   //End of Username

                   Spacer(modifier = Modifier.height(10.dp))

                   //Email

                   OutlinedTextField(
                       value = email,
                       onValueChange = {email=it},
                       modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                       leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
                       label = { Text(text = "Email Addres") },
                       colors = OutlinedTextFieldDefaults.colors(
                           unfocusedBorderColor = emarald,
                           focusedBorderColor = Color.Black,
                           unfocusedLeadingIconColor = newgreen

                       ),
                       keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)


                   )
                   //End of Email

                   Spacer(modifier = Modifier.height(10.dp))

                   //Password

                   OutlinedTextField(
                       value = password,
                       onValueChange = {password=it},
                       modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                       leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
                       label = { Text(text = "Password") },
                       colors = OutlinedTextFieldDefaults.colors(
                           unfocusedBorderColor = emarald,
                           focusedBorderColor = Color.Black,
                           unfocusedLeadingIconColor = newgreen

                       ),
                       keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                       visualTransformation = PasswordVisualTransformation()


                   )
                   //End of Password

                   Spacer(modifier = Modifier.height(10.dp))

                   //Confirmpassword

                   OutlinedTextField(
                       value = confirmpassword,
                       onValueChange = {confirmpassword=it},
                       modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                       leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
                       label = { Text(text = "Repeat Password") },
                       colors = OutlinedTextFieldDefaults.colors(
                           unfocusedBorderColor = emarald,
                           focusedBorderColor = Color.Black,
                           unfocusedLeadingIconColor = newgreen

                       ),
                       keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                       visualTransformation = PasswordVisualTransformation()



                   )
                   //End of ConfirmPassword

                   Spacer(modifier = Modifier.height(10.dp))

                   Button(
                       onClick = {

                       },
                       colors = ButtonDefaults.buttonColors(emarald),
                       shape = RoundedCornerShape(10.dp),
                       modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp)
                   ) {
                       Text(text = "Create An Account!")
                   }

                   Spacer(modifier = Modifier.height(10.dp))
                   TextButton(
                       onClick = {}
                   ) {
                       Text(text = "Already have an account? Login")
                   }

               }





           }
           //End of Card

       }




    }
    //End of main layout




@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())
}