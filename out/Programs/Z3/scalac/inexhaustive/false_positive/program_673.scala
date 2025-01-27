package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_D(a: (Char,Int)) extends T_B[T_A[Char]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(('x',_)) => 0 
}
}
// This is not matched: (CC_B T_B)