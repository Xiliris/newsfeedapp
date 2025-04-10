import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp

import etf.ri.rma.newsfeedapp.data.NewsData
import etf.ri.rma.newsfeedapp.model.NewsItem

@Composable
fun NewsFeedScreen() {
    val allNews = remember { NewsData.getAllNews() }
    var selectedCategory by remember { mutableStateOf("Sve") }

    Column(
        modifier = Modifier.padding(top = 20.dp)
    ) {

        FilterChips(selectedCategory) { selectedCategory = it }
        NewsList(news = filterNews(allNews, selectedCategory))
    }
}

fun filterNews(news: List<NewsItem>, category: String): List<NewsItem> {
    return if (category == "Sve") news else news.filter { it.category == category }
}

@Composable
fun FilterChips(selected: String, onCategorySelected: (String) -> Unit) {
    val categories = listOf("Sve", "Politika", "Sport", "Nauka/tehnologija", "Ne Postoji")

    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .fillMaxWidth()
            .padding(horizontal = 8.dp),

    ) {
        categories.forEach { category ->
            FilterChip(
                selected = selected == category,
                onClick = {
                    if (selected != category) onCategorySelected(category)
                },
                label = { Text(category) },
                modifier = Modifier.padding(2.dp)
            )
        }
    }
}
