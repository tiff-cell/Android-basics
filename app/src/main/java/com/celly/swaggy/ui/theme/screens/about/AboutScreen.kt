package com.celly.swaggy.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.celly.swaggy.R
import com.celly.swaggy.ui.theme.blueish
import com.celly.swaggy.ui.theme.burntorange


@Composable
fun AboutScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(painter = painterResource(R.drawable.shoppingicon), contentDescription = "", modifier = Modifier.size(100.dp))

        Spacer(modifier = Modifier.height(60.dp))


        Text(
            text = "Easy Shopping",
            fontSize = 40.sp,
            color = burntorange,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "a method of shopping where users can make purchases directly through text messages.",
            fontSize = 20.sp,
            color = Color.Black,
            fontFamily = FontFamily.Serif,

            )

        Spacer(modifier = Modifier.height(10.dp))


    }
    Row(
        modifier = Modifier.padding(start = 10.dp, top = 799.dp)
    ) {
        Box(modifier = Modifier.size(10.dp).background(blueish))
        Spacer(modifier = Modifier.width(10.dp))

        Box(modifier = Modifier.size(10.dp).background(blueish))
        Spacer(modifier = Modifier.width(10.dp))

        Box(modifier = Modifier.size(10.dp).background(blueish))
        Spacer(modifier = Modifier.width(200.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(blueish),
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
        ) {
            Text(text = "Skip")
        }

    }

}
@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}






