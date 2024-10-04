package com.example.natureapp.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

data class LugarNatural(
    val nombre: String,
    val descripcion: String,
    val imagenUrl: String
)

val lugaresNaturales = listOf(
    LugarNatural(
        "Montañas Rocosas",
        "Una impresionante cordillera que se extiende a lo largo de América del Norte, con picos cubiertos de nieve y una abundante vida silvestre.",
        "https://static.eldiario.es/clip/c9110a1b-bc8d-4ca7-a1da-316c9f4e068e_16-9-aspect-ratio_default_0.jpg"
    ),
    LugarNatural(
        "Gran Barrera de Coral",
        "El sistema de arrecifes más grande del mundo, ubicado en Australia, famoso por su diversidad marina y coloridos corales.",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZvMV1chk6ibLargJ_Xow52jP60jUY_gjt9Q&s"
    ),
    LugarNatural(
        "Desierto del Sahara",
        "El desierto cálido más grande del mundo, que abarca gran parte del norte de África, conocido por sus vastas dunas de arena.",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7j9krIYUj9PYWGnOEHRo3cK4PrRUsWBbqvw&s"
    ),
    LugarNatural(
        "Amazonas",
        "La selva tropical más grande del mundo, que alberga una increíble biodiversidad y es crucial para el equilibrio climático global.",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsJ1zqtY0ZBtTfpD-huT-Cz2CkwvymvFmAzg&s"
    ),
    LugarNatural(
        "Monte Everest",
        "La montaña más alta del mundo, ubicada en la cordillera del Himalaya, que atrae a montañistas de todo el mundo.",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSRtw5Nf5TpbxzuM5Z87T7CVhh5zsyjCZVuxg&s"
    )
)


@Composable
fun LugarNaturalCard(lugarNatural: LugarNatural) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            AsyncImage(
                model = lugarNatural.imagenUrl,
                contentDescription = lugarNatural.nombre,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = lugarNatural.nombre,
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = lugarNatural.descripcion,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}