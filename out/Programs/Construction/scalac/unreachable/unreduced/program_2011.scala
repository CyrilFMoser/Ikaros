package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Byte]], b: Int, c: T_B[Int, T_B[Char, Char]]) extends T_A[(T_B[Byte, (Byte,Boolean)],T_B[Byte, Boolean])]
case class CC_B[D](a: D, b: T_B[D, D], c: D) extends T_B[CC_A, D]
case class CC_C[E](a: T_B[CC_A, E]) extends T_B[CC_A, E]
case class CC_D() extends T_B[CC_A, T_A[T_B[CC_A, CC_A]]]

val v_a: T_B[CC_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _)) => 0 
  case CC_C(CC_C(CC_B(_, _, _))) => 1 
  case CC_C(CC_C(CC_C(_))) => 2 
}
}
// This is not matched: CC_B(_, _, _)