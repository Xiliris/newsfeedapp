import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import etf.ri.rma.newsfeedapp.model.NewsItem

@Composable
fun NewsList(news: List<NewsItem>) {
    if (news.isEmpty()) {
        MessageCard("Nema pronađenih vijesti u odabranoj kategoriji")
    } else {
        LazyColumn {
            items(news, key = { it.id }) { item ->
                if (item.isFeatured) {
                    FeaturedNewsCard(item)
                } else {
                    StandardNewsCard(item)
                }
            }
        }
    }
}