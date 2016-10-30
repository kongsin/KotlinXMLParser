# KotlinXMLParser
##### KotlinXMLParser is a library to map XML to an object or convert object to XML

### Feature
- Map XML to Object
- Convert Object to XML String
- Stream XML from URL and map to object

### There have XML string need to map to object
```Kotlin
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

```
### Bookstore object. must declare field name same with tag name that you need to map.

```Kotlin
class Bookstore {
    @JvmField var book: Array<Book>? = null
}

```
### Book object for store book detail.
```Kotlin
class Book {
    @JvmField var title: String? = null
    @JvmField var author: String? = null
    @JvmField var year: String? = null
    @JvmField var price: String? = null
}

```
### Lets go to map XML to object jsut very easy just one line.
```Kotlin
var book = XMLParser().fromXML(xml, Bookstore()) as Bookstore

// Print object to see the result
book.book!!.forEach {  book ->
    println("---------------------")
    println("TITLE : " + book.title)
    println("AUTHOR : " + book.author)
    println("YEAR : " + book.year)
    println("PRICE : " + book.price)
}
```
### Below is the result that show in display
```
---------------------
TITLE : Harry Potter
AUTHOR : K. Kongsin
YEAR : 2005
PRICE : 29.99
---------------------
TITLE : Learning XML
AUTHOR : Erik T. Ray
YEAR : 2003
PRICE : 39.95
```
