import core.XMLParser
import example.CATALOG
import java.net.URL

fun main(string: Array<String>) {
    var xml = "<bookstore>\n" +
            "  <book category=\"children\">\n" +
            "    <title>Harry Potter</title>\n" +
            "    <author>J K. Rowling</author>\n" +
            "    <author>K. Kongsin</author>\n" +
            "    <year>2005</year>\n" +
            "    <price>29.99</price>\n" +
            "  </book>\n" +
            "  <book category=\"web\">\n" +
            "    <title>Learning XML</title>\n" +
            "    <author>Erik T. Ray</author>\n" +
            "    <year>2003</year>\n" +
            "    <price>39.95</price>\n" +
            "  </book>\n" +
            "</bookstore>";
    var catalog = XMLParser().fromXML(URL("http://www.w3schools.com/xml/cd_catalog.xml"), CATALOG()) as CATALOG

   var ncat = XMLParser().fromXML(XMLParser().toXML(catalog), CATALOG()) as CATALOG

        ncat.CD!!.forEach {
            cd ->
            println(cd.TITLE)
            println(cd.ARTIST)
            println(cd.COMPANY)
            println(cd.COUNTRY)
            println(cd.PRICE)
            println(cd.YEAR)
        }

}