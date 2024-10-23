package com.example.layoutjetpackcomposeee

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(
    modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxSize()) {
        SectionHeader()
        MainSection()
    }
}

@Composable
fun SectionHeader() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray)) {
            Row (
                modifier = Modifier.padding(15.dp)
            ){
                Box(contentAlignment = Alignment.BottomEnd) {
                    Image(
                        painter = painterResource(id = R.drawable.pssi),
                        contentDescription = "", Modifier.size(100.dp)
                    )
                    Icon(
                        Icons.Filled.Check,
                        contentDescription = "",
                        Modifier
                            .padding(end = 15.dp)
                            .size(25.dp),
                        tint = Color.Blue
                    )
                }
                Column(Modifier.padding(15.dp)) {

                    Text(text = "PSSI",
                        color = Color.White)
                    Spacer(Modifier.padding(3.dp))
                    Text(text = "Football Association of Indonesia",
                        color = Color.White
                    )
                }
            }
    }
}

@Composable
fun MainSection(){
    Column(horizontalAlignment = Alignment.Start) {
        Text(text = "Kepada YTH :")
        Text(text = "Jodi, Jodi")
        Spacer(modifier = Modifier.padding(20.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Nama", modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = "Rama Ramdani", modifier = Modifier.weight(2f))
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "NIM", modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = "20220140098", modifier = Modifier.weight(2f))
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Kelas", modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = "B", modifier = Modifier.weight(2f))
        }
    }
}