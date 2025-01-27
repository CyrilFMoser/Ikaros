package Program_31 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: Int) extends T_A
case class CC_B[C, D](a: T_B[D, D], b: C, c: T_A) extends T_B[C, T_B[CC_A, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A (CC_B Wildcard Byte T_A)
//      Wildcard
//      (Tuple (CC_B Wildcard Wildcard T_A) Wildcard)
//      T_A)