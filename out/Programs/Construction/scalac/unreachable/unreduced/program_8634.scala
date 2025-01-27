package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A[Byte], b: Byte, c: (CC_A[Int],T_A[Char])) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, (CC_A(_),_)) => 1 
}
}