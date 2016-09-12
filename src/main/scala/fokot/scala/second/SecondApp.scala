package fokot.scala.second

import fokot.scala.first.FirstService

object SecondService {

  def doWhatIdo: String = s"Service call returned number ${FirstService.plus(3)}"
}


object SecondApp extends App {

  println(SecondService.doWhatIdo)
}