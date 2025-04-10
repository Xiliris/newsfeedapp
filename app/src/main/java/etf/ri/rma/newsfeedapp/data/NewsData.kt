package etf.ri.rma.newsfeedapp.data

import etf.ri.rma.newsfeedapp.model.NewsItem
import java.util.UUID

object NewsData {
    fun getAllNews(): List<NewsItem> = listOf(
        // Sport News
        NewsItem(UUID.randomUUID().toString(), "Fudbalski derbi u Sarajevu", "Veliki gradski derbi između Sarajeva i Željezničara privukao je veliku pažnju navijača.", null, "Sport", false, "Source A", "2024-04-01"),
        NewsItem(UUID.randomUUID().toString(), "Atletičar postavio novi rekord", "Na takmičenju u Zagrebu, atletičar Amir Kovač postavio je novi rekord u trčanju na 100m.", null, "Sport", true, "Source B", "2024-04-02"),
        NewsItem(UUID.randomUUID().toString(), "Košarkaški turnir u Mostaru", "Najveći košarkaški turnir u regionu okupio je više od 30 ekipa iz različitih zemalja.", null, "Sport", false, "Source C", "2024-04-03"),
        NewsItem(UUID.randomUUID().toString(), "Maraton u Beogradu", "Beogradski maraton okupio je rekordnih 10.000 učesnika iz svih krajeva sveta.", null, "Sport", true, "Source D", "2024-04-04"),
        NewsItem(UUID.randomUUID().toString(), "Vaterpolo liga počinje", "Novi sezonu vaterpolo lige pratiće veliki broj ekipa i navijača.", null, "Sport", false, "Source E", "2024-04-05"),
        NewsItem(UUID.randomUUID().toString(), "Novak Đoković osvojio titulu", "Novak Đoković je po deseti put u svojoj karijeri osvojio titulu na Wimbledonu.", null, "Sport", true, "Source F", "2024-04-06"),
        NewsItem(UUID.randomUUID().toString(), "Formula 1: Velika nagrada Monaka", "Završeno je najprestižnije takmičenje u Formuli 1, gde je prvi put pobedio Max Verstappen.", null, "Sport", false, "Source G", "2024-04-07"),

        // Politika News
        NewsItem(UUID.randomUUID().toString(), "Izbori u Bosni i Hercegovini", "U BiH su održani izbori, a rezultati pokazuju veliku podelu među strankama.", null, "Politika", false, "Source H", "2024-04-08"),
        NewsItem(UUID.randomUUID().toString(), "Sporazum o ekološkoj saradnji", "Bosna i Hercegovina potpisala je novi sporazum sa susednim zemljama o zaštiti životne sredine.", null, "Politika", true, "Source I", "2024-04-09"),
        NewsItem(UUID.randomUUID().toString(), "Novi zakon o zapošljavanju", "Vlada je predložila novi zakon koji će olakšati zapošljavanje mladih ljudi u zemlji.", null, "Politika", false, "Source J", "2024-04-10"),
        NewsItem(UUID.randomUUID().toString(), "Poseta predsednika Amerike", "Predsednik Sjedinjenih Američkih Država dolazi u zvaničnu posetu Bosni i Hercegovini.", null, "Politika", true, "Source K", "2024-04-11"),
        NewsItem(UUID.randomUUID().toString(), "Protesti u Sarajevu", "Na ulicama Sarajeva održani su protesti zbog novih fiskalnih politika.", null, "Politika", false, "Source L", "2024-04-12"),
        NewsItem(UUID.randomUUID().toString(), "Izborna reforma u Crnoj Gori", "Crna Gora uvodi reformu u izborni sistem kako bi poboljšala političku stabilnost.", null, "Politika", true, "Source M", "2024-04-13"),
        NewsItem(UUID.randomUUID().toString(), "Regulisanje prava žena", "Ministarstvo za ljudska prava Bosne i Hercegovine pokreće novu inicijativu za poboljšanje prava žena.", null, "Politika", false, "Source N", "2024-04-14"),

        // Nauka/Tehnologija News
        NewsItem(UUID.randomUUID().toString(), "Nova tehnologija za brže internet konekcije", "Inženjeri su razvili novu tehnologiju koja omogućava internet brzine do 10 Gbps.", null, "Nauka/tehnologija", true, "Source O", "2024-04-15"),
        NewsItem(UUID.randomUUID().toString(), "Roboti u industriji", "Industrija koristi robote za ubrzavanje proizvodnje i smanjenje grešaka.", null, "Nauka/tehnologija", false, "Source P", "2024-04-16"),
        NewsItem(UUID.randomUUID().toString(), "Napredak u istraživanju Marsa", "NASA je napravila velike korake u istraživanju Marsa sa novim roverima i tehnologijama.", null, "Nauka/tehnologija", true, "Source Q", "2024-04-17"),
        NewsItem(UUID.randomUUID().toString(), "Prvi 3D štampani dom", "U Kini je izgrađen prvi dom pomoću 3D štampača, što je revolucija u građevinskoj industriji.", null, "Nauka/tehnologija", false, "Source R", "2024-04-18"),
        NewsItem(UUID.randomUUID().toString(), "Novi medicinski uređaj za dijagnostiku", "Lanci globalnih bolnica počeli su koristiti novi uređaj za preciznu dijagnostiku bolesti.", null, "Nauka/tehnologija", true, "Source S", "2024-04-19"),
        NewsItem(UUID.randomUUID().toString(), "Vještačka inteligencija u obrazovanju", "Sve više škola počinje koristiti vještačku inteligenciju za personalizovanu nastavu.", null, "Nauka/tehnologija", false, "Source T", "2024-04-20")
    )
}