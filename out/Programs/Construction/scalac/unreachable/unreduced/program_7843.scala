package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, T_A[Boolean, T_A[Boolean, (Byte,Byte)]]], b: T_A[C, C], c: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B[E]() extends T_A[Boolean, E]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_A(_, _, _), _, _)