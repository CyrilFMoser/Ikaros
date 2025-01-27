package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C() extends T_B[(CC_B[Boolean],T_A[Byte]), T_A[CC_A[(Boolean,Boolean)]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, CC_B())) => 1 
  case CC_A(_, _, CC_A(CC_B(), _, CC_A(_, _, _))) => 2 
  case CC_A(_, _, CC_A(CC_B(), _, CC_B())) => 3 
  case CC_B() => 4 
}
}
// This is not matched: CC_A(_, _, CC_B())