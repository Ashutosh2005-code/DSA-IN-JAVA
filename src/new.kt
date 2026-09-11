import kotlin.reflect.typeOf

fun main(){
        println("Enter your name: ")
        println("Enter your age: ") //comment
        /*multi-line
        comment.
         */

        var name = "John"
        val birthyear = 1975

        println(name)
        println(birthyear)

        val namee = "John"
        println("Hello " + namee)


        val firstName = "John "
        val lastName = "Doe"
        val fullName = firstName + lastName
        println(fullName)  //we can combine two variables.
         // Data Types.
//        val myNum = 5             // Int
//        val myDoubleNum = 5.99    // Double
//        val myLetter = 'D'        // Char
//        val myBoolean = true      // Boolean
//        val myText = "Hello"      // String

        // another way

        val myNum:
                Int = 5                // Int
        val myDoubleNum:
                Double = 5.99    // Double
        val myLetter:
                Char = 'D'          // Char
        val myBoolean:
                Boolean = true     // Boolean
        val myText:
                String = "Hello"      // String


        /*
        To convert a numeric data type to another type,
        you must use one of the following functions:
        toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():
         */

        val x: Int = 5
        val y: Long = x.toLong()
        println(y)


    //string and accessing it
    val txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)

    val txtt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txtt.length) //gives length of fxn

    /*
    There are many string functions available,
    for example uppercase() and lowercase():
     */

    var txtx = "Hello World"
    println(txtx.uppercase())   // Outputs "HELLO WORLD"
    println(txtx.lowercase())   // Outputs "hello world"


    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)


    //WHEN CONDITION
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    //WHILE LOOP
    var i = 1
    while (i < 10 ) {
        println("2 * "+i + " = "+i * 2)
        i++
    }


    }