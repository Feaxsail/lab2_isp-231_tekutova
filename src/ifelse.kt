fun main() {
//    println("введите первое число: ")
//    val number1 = readln().toInt()
//    println("введите второе число: ")
//    val number2 = readln().toInt()
//    if (number1>number2){
//        println("первое число больше")
//    }
//    else {
//        println("второе число больше")
//    }
//    val max = if (number1>number2) number1 else number2
//    println("максимальное число: $max")
//    val age = readln().toInt()
//    val status = if (age>=18) "совершеннолетний" else "несовершеннолетний"
//    println(status)
//    println("введите урон: ")
//    val uron = readln().toInt()
//    println("щит активен? (да или нет): ")
//    val sit = readln()
//    val a=uron/2
//    if (sit == "да"){
//        println("полученный урон: $a")
//    }
//    else{
//        println("полученный урон: $uron")
//    }
//    println("введите уровень")
//    val level = readln().toInt()
//    println("есть ли vip-статус?(true или false): ")
//    val vip = readln()
//    if ((level<30) || ((level>=30 && vip=="false") && (level<50)  )){
//        println("доступ запрещен")
//    }
//    if ((level>=30 && vip=="true") || (level>=50)  ){
//        println("доступ разрешен")
//    }
//    val numbers = 1..100
//    val symbol = 'a'..'z'
//    print("введите ваш уровень: ")
//    val level = readln().toInt()
//    if (level in 1..50) {
//        println("уровень $level соответствует требованиям")
//
//    }
//    else {
//        println("высокий уровень! вход запрещен")
//
//    print("введите порядковый номер месяца(1-12)")
//    val index = readln().toInt()
//    var month = ""
//    if (index == 1){
//        month = "январь"
//    }
//    else if (index == 2){
//        month = "февраль"
//    }
//    else if (index == 3){
//        month = "март"
//    }
//    else if (index == 4){
//        month = "апрель"
//    }
//    else if (index == 5){
//        month = "май"
//    }
//    else if (index == 6){
//        month = "июнь"
//    }
//    else if (index == 7){
//        month = "июль"
//    }
//    else if (index == 8){
//        month = "август"
//    }
//    else if (index == 9){
//        month = "сентябрь"
//    }
//    else if (index == 10){
//        month = "октябрь"
//    }
//    else if (index == 11){
//        month = "ноябрь"
//    }
//    else if (index == 12){
//        month = "декабрь"
//    }
//    if (index in 1..12){
//        println("номер $index, месяц $month")
//}