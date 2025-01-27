package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D](a: Int) extends T_A[E, D]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_D Wildcard T_B)