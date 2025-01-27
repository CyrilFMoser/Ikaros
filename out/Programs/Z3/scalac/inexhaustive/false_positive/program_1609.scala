package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[Boolean]) extends T_A[(Char,Boolean)]

val v_a: T_A[(Char,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_B (CC_A Wildcard T_A) Wildcard T_A) T_A)