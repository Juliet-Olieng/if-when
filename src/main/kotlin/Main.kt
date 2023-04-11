fun main(args: Array<String>) {
    val ageOutput=ages(10)
    val ageOutput1=ages(19)

    ageNumbers(20)
    ageNumbers(17)

    arrAge(14)
    arrAge(21)

    arryStr()

    days()

}
//if ....else
fun ages(age:Int){
    if (age>18){
        println("adult")
    }
    else{
        println("minor")
    }
}
//if...elseif..else:
fun ageNumbers(age:Int){
    if (age>19){
        println("adult")
    }
    else if(age>12 && age<18){
        println("teen")
    }
    else{
        println("minor")
    }
}
//nested if:allow an if expression inside another if expression
fun arrAge(age:Int){
    if(age>12){
        if (age>12 && age<20){
            println("teen")
        }else{
            println("adult")
        }
    }else{
        println("minor")
    }
}
//quiz
fun arryStr(){
    var x=20
    var y=15
    var z="mango"
    val result=if (x>y){
        z="Orange"
    }else{
        z="apple"
    }
    println("value of results=$z")
}
//when statement
fun days(){
    val day =2
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
}
//range in when  conditions
fun weekDays(){
    val day =2
    when (day){
        in 1..5 -> println("weekday")
        else -> println("weekend")
    }
}


