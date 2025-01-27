package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Int, b: Char) extends T_A[T_A[T_A[Char]]]
case class CC_C[C](a: C, b: T_A[C], c: T_B[C]) extends T_B[C]
case class CC_D[D](a: CC_B, b: Byte, c: Int) extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: T_B[T_A[T_A[T_A[Char]]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_D(CC_B(_, _), _, _)