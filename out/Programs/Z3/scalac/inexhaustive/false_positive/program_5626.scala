package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[C, T_A[Int, Char]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Int Wildcard (T_A Int))