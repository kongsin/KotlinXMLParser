import core.XMLParser
import example.CATALOG
import java.net.URL

fun main(string: Array<String>) {

    val catalog = XMLParser(CATALOG::class.java).fromXML(URL("http://www.w3schools.com/xml/cd_catalog.xml"))
    catalog.CD!!.forEach {
        cd ->
        println(cd.TITLE)
        println(cd.ARTIST)
        println(cd.COMPANY)
        println(cd.COUNTRY)
        println(cd.PRICE)
        println(cd.YEAR)
    }

}