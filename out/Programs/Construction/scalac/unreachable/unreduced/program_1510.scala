package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[(T_A[Char, Boolean],Char), E]
case class CC_B[F]() extends T_A[(T_A[Char, Boolean],Char), F]
case class CC_C(a: CC_B[CC_A[Boolean]], b: T_A[CC_B[Boolean], T_A[Char, Byte]]) extends T_A[(T_A[Char, Boolean],Char), T_A[CC_B[Char], CC_A[Boolean]]]

val v_a: T_A[(T_A[Char, Boolean],Char), T_A[CC_B[Char], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_B(), _)