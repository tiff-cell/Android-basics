package com.celly.swaggy.ui.theme.screens.dashboard

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
import com.celly.swaggy.navigation.ROUT_DASHBOARD
import com.celly.swaggy.navigation.ROUT_HOME
import com.celly.swaggy.navigation.ROUT_ITEM
import com.celly.swaggy.ui.theme.burntorange
import com.celly.swaggy.ui.theme.emarald
import com.celly.swaggy.ui.theme.newblueish


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(


        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = burntorange
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Homepage") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        //navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray,
                modifier = Modifier.offset(y = 35.dp),
                shape = CircleShape
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        //Content
        content = { paddingValues ->
                              Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .background(Color.Gray)
            ) {


                //Main Contents of the page
                Spacer(modifier = Modifier.height(10.dp))


                //Column
                Column(
                    modifier = Modifier
                        .background(Color.White)
                        .padding(bottom = 30.dp)
                ) {


                    //Row

                    Row(
                        modifier = Modifier.fillMaxWidth().height(200.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Column {

                            Text(
                                text = "Hello Samantha",
                                fontSize = 20.sp,
                                modifier = Modifier.padding(start = 20.dp),
                                fontWeight = FontWeight.Bold

                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Here are your projects",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp)

                            )
                        }


                        Image(
                            painter = painterResource(R.drawable.img_4,),
                            contentDescription = "Nurse",
                            modifier = Modifier.fillMaxHeight().width(100.dp),
                            contentScale = ContentScale.Crop
                        )
                    }

                    //End of Row


                    Spacer(modifier = Modifier.width(10.dp))


                    //Row
                    Row(
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .horizontalScroll(rememberScrollState())
                    ) {
                        //Card
                        Card(
                            onClick = { navController.navigate(ROUT_HOME) },
                            modifier = Modifier.width(200.dp).height(250.dp),
                            colors = CardDefaults.cardColors(burntorange)
                        ) {

                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_1),
                                    contentDescription = "",
                                    modifier = Modifier.width(50.dp).height(50.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Cryptocurrency",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Landing page",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )

                            }
                        }
                        //End of Card

                        //Card

                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            onClick = {},
                            modifier = Modifier.width(200.dp).height(250.dp),
                            colors = CardDefaults.cardColors(emarald)
                        ) {

                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_2),
                                    contentDescription = "",
                                    modifier = Modifier.width(50.dp).height(50.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Text(
                                    text = "Statistic Dashboard",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                        //End of Card

                        //Card

                        Spacer(modifier = Modifier.width(10.dp))


                        Card(
                            onClick = {},
                            modifier = Modifier.width(200.dp).height(250.dp),
                            colors = CardDefaults.cardColors(emarald)
                        ) {

                            Column {
                                Image(
                                    painter = painterResource(R.drawable.img_3),
                                    contentDescription = "necklace",
                                    modifier = Modifier.width(50.dp).height(50.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Necklace",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                        //End of Card
                    }
                    //End of row

                }

                //End of colum with a white background

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Personal Task",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))


                //Card
                Card(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp).height(100.dp),
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_3),
                            contentDescription = "necklace",
                            modifier = Modifier.width(50.dp).height(50.dp),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(10.dp))

                        Column {
                            Text(
                                text = "Statistic Dashboard",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Landing page",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )


                        }

                    }

                }
                                  //End of Card



                                  Spacer(modifier = Modifier.height(10.dp))


                                  //Card
                                  Card(
                                      onClick = {},
                                      modifier = Modifier.fillMaxWidth().padding(start = 20.dp).height(100.dp),
                                  ) {
                                      Row(
                                          modifier = Modifier.fillMaxSize(),
                                          verticalAlignment = Alignment.CenterVertically
                                      ) {
                                          Image(
                                              painter = painterResource(R.drawable.img_3),
                                              contentDescription = "necklace",
                                              modifier = Modifier.width(50.dp).height(50.dp),
                                              contentScale = ContentScale.Crop
                                          )
                                          Spacer(modifier = Modifier.width(10.dp))

                                          Column {
                                              Text(
                                                  text = "Statistic Dashboard",
                                                  fontSize = 20.sp,
                                                  fontWeight = FontWeight.Bold
                                              )
                                              Text(
                                                  text = "Landing page",
                                                  fontSize = 20.sp,
                                                  fontWeight = FontWeight.Bold
                                              )


                                          }

                                      }





                                  }
                                  //End of Card

            }




        }
    )
    //End of scaffold
}




@Preview(showBackground = true)
@Composable
fun DashoardScreenPreview(){
    DashboardScreen(rememberNavController())
}