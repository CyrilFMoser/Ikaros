package Program_30 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B[C](a: C, b: Boolean, c: T_A) extends T_B[C, T_B[C, CC_A]]
case class CC_C[E, D, F](a: Char, b: E) extends T_B[D, E]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_C('x', _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: (CC_C Byte
//      (CC_A (CC_A T_A T_A) (CC_A T_A (T_B T_A T_A)))
//      T_A
//      Wildcard
//      Wildcard
//      (T_B (CC_A (CC_A T_A T_A) (CC_A T_A (T_B T_A T_A))) Byte))
// This is not matched: Pattern match is empty without constants