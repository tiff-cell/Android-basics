package com.celly.swaggy.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.celly.swaggy.R
import com.celly.swaggy.ui.theme.newgreen


@Composable
fun DashboardScreen2(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        //Card

        Card(
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 60.dp),
            colors = CardDefaults.cardColors(newgreen)
        ) {

            Column (
                modifier = Modifier.padding(all = 20.dp)
            ){
                IconButton(onClick ={} ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "",
                        tint = Color.White
                    )
            }
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Statistic Dashboard", fontSize = 25.sp, fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Statistic Dashboard", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                //Row
                Row (
                    horizontalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.img_4),
                        contentDescription = "",
                        modifier = Modifier.width(30.dp).height(30.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Samantha", fontSize = 25.sp, fontWeight = FontWeight.Bold)

                    //End of Row


                }




            }

        }
        //End of Card
    }

}


@Preview(showBackground = true,)
@Composable
fun  DashboardScreen2Preview(){
    DashboardScreen2(rememberNavController())
}