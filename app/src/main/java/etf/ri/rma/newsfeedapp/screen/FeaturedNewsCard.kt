import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import etf.ri.rma.newsfeedapp.model.NewsItem
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import etf.ri.rma.newsfeedapp.R

@Composable
fun FeaturedNewsCard(item: NewsItem) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(8.dp)) {

            // Banner image placeholder
            Image(
                painter = painterResource(id = R.drawable.placeholder),
                contentDescription = "Banner image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop

            )

            Spacer(modifier = Modifier.height(12.dp))

            // Title
            Text(
                text = item.title,
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                maxLines = 2
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Snippet
            Text(
                text = item.snippet,
                style = MaterialTheme.typography.bodyLarge,
                maxLines = 2
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Source & Date
            Text(
                text = "Izvor: ${item.source} • ${item.publishedDate}",
                style = MaterialTheme.typography.labelSmall
            )
        }
    }
}
