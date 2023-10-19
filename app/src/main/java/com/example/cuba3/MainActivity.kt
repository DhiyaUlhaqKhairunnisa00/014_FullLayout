package com.example.cuba3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cuba3.ui.theme.Cuba3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cuba3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "WEATHER APP",
            fontSize = 40.sp)
        BoxHeader()
        Spacer(modifier = Modifier.padding(5.dp))
        Lokasi()
    }
}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan))
    {
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = painterResource(id = R.drawable.bg), contentDescription = "",
                modifier = Modifier.size(200.dp)
            )
            Text(
                text = "Rain",
                fontSize = 25.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}

@Composable
fun Lokasi(){
    Text(
        text = "19 C",
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold)
    Row() {
        Image(painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = "",
        modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp)
    }
    Spacer(modifier = Modifier.padding(5.dp))
    Text(text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Gray)
}

@Composable
fun info() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Top Texts
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Text 1 (Top left)
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Humidity",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Text(
                        text = "98%",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth().padding(top = 4.dp)
                    )
                }

                // Spacer to push Text 2 to the right
                Spacer(modifier = Modifier.weight(1f))

                // Text 2 (Top right)
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "UV Index",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Text(
                        text = "9/10",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            // Spacer to push Bottom Texts apart
            Spacer(modifier = Modifier.height(16.dp))

            // Bottom Texts
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Text 3 (Bottom left)
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Sunrise",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Text(
                        text = "05.00 AM",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                // Spacer to push Text 4 to the right
                Spacer(modifier = Modifier.weight(1f))

                // Text 4 (Bottom right)
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Sunset",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Text(
                        text = "05.40 PM",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Cuba3Theme {
        Home()
    }
}