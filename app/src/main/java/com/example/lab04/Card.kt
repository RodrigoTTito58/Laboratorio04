import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

@Composable
fun MiTarjetaComponente() {
    // Modifica un valor pequeño, por ejemplo, el padding o el texto
    Card(
        modifier = Modifier.padding(24.dp) // Cambiado de 16.dp a 24.dp
    ) {
        Text(
            text = "Componente Card modificado en la rama", // Texto actualizado
            modifier = Modifier.padding(16.dp)
        )
    }
}