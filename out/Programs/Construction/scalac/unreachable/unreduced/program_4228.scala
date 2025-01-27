package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Char,Char), b: T_A[T_A[Char]], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D](a: T_A[D], b: Byte, c: T_B[D]) extends T_B[D]
case class CC_D[E]() extends T_B[E]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, 0, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_B()