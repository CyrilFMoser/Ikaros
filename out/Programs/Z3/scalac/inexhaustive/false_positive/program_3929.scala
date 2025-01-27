package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Boolean, Boolean]]
case class CC_B() extends T_A[T_B[Boolean, Boolean]]
case class CC_C[D](a: T_B[CC_A, CC_B]) extends T_B[CC_A, D]
case class CC_E[E]() extends T_B[CC_A, E]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants