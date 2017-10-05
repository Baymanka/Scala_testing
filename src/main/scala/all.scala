import scala.util.control.Breaks._

object all extends App {

  breakable {
    while (true) {
      println("Please enter your input \nПример: 1 + 2")
      val line = Console.readLine()
      if (line.equals("Stop!")) {
        break()
      }
      println("Calculating!")
      val res = line.split(" ")
if (res.length==3){
      if (res(1).equals("+")) {
        println(res(0).toInt + res(2).toInt)
      }

      else if (res(1).equals("-")) {
        println(res(0).toInt - res(2).toInt)
      }

      else if (res(1).equals("*")) {
        println(res(0).toInt * res(2).toInt)
      }
      else if (res(1).equals("/")) {
        println(res(0).toInt / res(2).toInt)

      }}
      else {
        println("Неправильный формат ввода! \nПример: 1 + 2 \nДавайте еще раз \nЧто бы закончить введите Stop!")

      }
    }
  }

}
