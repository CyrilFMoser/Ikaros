package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[(Char,Boolean)]) extends T_A[(Int,Boolean)]

val v_a: T_A[(Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_D (CC_A T_A T_A) Wildcard (T_B (CC_A T_A T_A)))