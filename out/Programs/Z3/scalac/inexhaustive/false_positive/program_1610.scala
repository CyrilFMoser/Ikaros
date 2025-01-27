package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: Byte) extends T_A[(Char,Boolean)]

val v_a: T_A[(Char,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_B (CC_A Wildcard T_A) Wildcard T_A) T_A)