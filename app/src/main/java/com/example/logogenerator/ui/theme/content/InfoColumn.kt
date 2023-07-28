package com.example.logogenerator.ui.theme.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.logogenerator.ui.theme.component.ActionButton
import com.example.logogenerator.ui.theme.component.TitleText

@Composable
fun InfoColumn(){
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {

        TitleText("2. Introduce información adicional")

        ActionButton(text = "Iniciar Grabación", icon = Icons.Filled.Info, description = "Iniciar grabación") {
            // Click

        }



    }
}