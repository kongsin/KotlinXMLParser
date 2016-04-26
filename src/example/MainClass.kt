import core.XMLParser
import example.Book
import example.Bookstore

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
    var book = XMLParser().fromXML(xml, Bookstore()) as Bookstore

    book.book!!.forEach {
        book ->
        println("---------------------")
        println("TITLE : " + book.title)
        println("AUTHOR : " + book.author)
        println("YEAR : " + book.year)
        println("PRICE : " + book.price)
    }
}