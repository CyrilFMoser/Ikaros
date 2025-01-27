package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E](a: E) extends T_A[E, T_B[Int]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_D Boolean Boolean Byte Wildcard Wildcard (T_B Boolean Boolean))
//      (T_A (CC_A Char Boolean Boolean) (T_A Char Byte)))