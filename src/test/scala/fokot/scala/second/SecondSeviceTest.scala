package fokot.scala.second

import org.specs2.mutable.Specification

class SecondSeviceTest extends Specification {

  "doWhatIdo should do what it does" >> {
    SecondService.doWhatIdo mustEqual "Service call returned number 8"
  }

}