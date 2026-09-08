import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

@Composable
fun MiTarjetaComponente() {
    Card(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Componente Card añadido correctamente",
            modifier = Modifier.padding(16.dp)
        )
    }
}