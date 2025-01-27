package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[Char, D], b: Int) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: E, c: T_A[CC_A[E]]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D(a: T_A[CC_C[Char]], b: T_B[Byte, CC_A[Byte]]) extends T_B[CC_A[T_A[Int]], CC_B[T_B[Byte, Int]]]
case class CC_E[G]() extends T_B[G, T_A[T_B[CC_D, CC_D]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), _, CC_B(_, CC_A(_, _), CC_A(_, _))) => 2 
  case CC_B(CC_A(_, _), _, CC_B(_, CC_A(_, _), CC_B(_, _, _))) => 3 
  case CC_B(CC_A(_, _), _, CC_B(_, CC_A(_, _), CC_C())) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_B(CC_A(_, _), _, CC_C())