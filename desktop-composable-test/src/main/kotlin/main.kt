import androidx.compose.desktop.Window
import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow

fun main() = Window(
    title = "Hello world",
) {
    var text by remember { mutableStateOf("Hello, World!") }
    NewsStory()
}

@Composable
fun NewsStory() {
    MaterialTheme {
        val typography = MaterialTheme.typography
        Column(
            modifier= Modifier.padding(16.dp),
            verticalArrangement= Arrangement.spacedBy(10.dp)
        ) {
            Surface {

            }
            Image(
                imageFromResource("adele.jpeg"),
                contentDescription = "",
                modifier = Modifier.height(180.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(16.dp))
            Text("A day wandering through the sandhills in Shark Fin Cove, and a few of the sights I saw",
                style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis)
            Text("Davenport, California", style = typography.body2)
            Text("December 2018", style = typography.body2)
        }
    }
}
@Composable
fun Greetings() {
    Text("Hello Thando")
}

