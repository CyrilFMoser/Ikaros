package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B[C](a: T_A[Boolean], b: C, c: T_A[Boolean]) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)