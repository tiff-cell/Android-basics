package com.celly.swaggy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.celly.swaggy.ui.theme.screens.about.AboutScreen
import com.celly.swaggy.ui.theme.screens.category.CategoryScreen
import com.celly.swaggy.ui.theme.screens.contact.ContactScreen
import com.celly.swaggy.ui.theme.screens.details.DetailScreen
import com.celly.swaggy.ui.theme.screens.home.HomeScreen
import com.celly.swaggy.ui.theme.screens.intent.IntentScreen
import com.celly.swaggy.ui.theme.screens.item.ItemScreen
import com.celly.swaggy.ui.theme.screens.scaffold.ScaffoldScreen
import com.celly.swaggy.ui.theme.screens.tiff.TiffScreen
import com.celly.swaggy.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_CATEGORY) {
            CategoryScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_TIFF) {
            TiffScreen(navController)
        }
        composable(ROUT_SCAFFOLD) {
            ScaffoldScreen(navController)
        }
        composable(ROUT_DETAIL) {
           DetailScreen(navController)
        }
        composable(ROUT_DETAIL) {
            IntentScreen(navController)
        }



    }
}