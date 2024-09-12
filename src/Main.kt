//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.math.pow
import kotlin.math.log
fun main() {
    println("Введите строку символов: ")
    val text = readln()
    var result=""
    var count = 1
    var previous = text[0]


    for(i in 1 .. text.length-1)
    {
        if(previous == text[i])
        {
            count += 1
            previous = text[i]
        }
        else
        {
            if (count > 1)
            {
                result = result + count + previous
            }
            else
            {
                result = result + previous
            }
            count = 1
            previous = text[i]
        }
    }
    if (count>1)
    {
        result = result + count + previous
    }
    else
    {
        result = result + previous
    }
    println(result)
}