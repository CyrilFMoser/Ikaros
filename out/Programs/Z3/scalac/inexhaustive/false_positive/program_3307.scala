package Program_15 

object Test {
sealed trait T_B[B, C]
case class CC_B[E, F](a: (Char,Int)) extends T_B[E, F]

val v_a: CC_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_E Wildcard T_B)