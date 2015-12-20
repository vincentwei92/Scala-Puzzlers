import scala.annotation.StaticAnnotation
import scala.annotation.implicitNotFound

@implicitNotFound(msg = "Cannot construct a collection of type ${To} with elements of type ${Elem} based on a collection of type ${From}.")
trait CanBuildFrom[-From, -Elem, +To] {}


final class NFound(msg: String) extends scala.annotation.StaticAnnotation {}

class A
class B extends A