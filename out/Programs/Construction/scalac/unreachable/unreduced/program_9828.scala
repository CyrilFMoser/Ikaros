package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]], b: T_B[T_A[Char]]) extends T_A[(T_B[Char],T_A[Boolean])]
case class CC_B(a: CC_A, b: T_B[T_A[CC_A]], c: T_B[(Int,CC_A)]) extends T_A[(T_B[Char],T_A[Boolean])]
case class CC_C() extends T_A[(T_B[Char],T_A[Boolean])]
case class CC_D[C](a: C, b: CC_A, c: Char) extends T_B[C]
case class CC_E[D](a: CC_C) extends T_B[D]

val v_a: T_A[(T_B[Char],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, CC_A(_, _), 'x')) => 0 
  case CC_A(_, CC_D(_, CC_A(_, _), _)) => 1 
  case CC_A(_, CC_E(_)) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(_, _, _)