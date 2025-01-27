package Program_29 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, E], b: E, c: C) extends T_A[C, D]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard Wildcard (T_A Char Int))
// This is not matched: (CC_D (CC_C Byte Wildcard Wildcard Wildcard (T_B Byte))
//      (T_B (CC_A T_A T_A T_A)))