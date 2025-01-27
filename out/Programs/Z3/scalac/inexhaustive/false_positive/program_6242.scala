package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[D]() extends T_A[D, T_A[Int, Int]]
case class CC_C[E](a: Int) extends T_A[E, CC_B[Char]]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_E (T_B (CC_A (CC_B Boolean Boolean) Boolean Boolean Boolean Boolean)))