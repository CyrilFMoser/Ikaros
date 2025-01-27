package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]], b: T_B[T_A[Byte], T_A[Int]]) extends T_A[(T_A[Byte],T_A[Int])]
case class CC_B(a: CC_A) extends T_A[(T_A[Byte],T_A[Int])]
case class CC_C(a: T_B[T_B[CC_A, CC_B], CC_B], b: CC_A) extends T_A[(T_A[Byte],T_A[Int])]
case class CC_D[D](a: CC_C, b: T_B[D, D]) extends T_B[D, T_B[T_B[CC_A, CC_B], CC_B]]
case class CC_E[E](a: E, b: E, c: Int) extends T_B[E, T_B[T_B[CC_A, CC_B], CC_B]]

val v_a: T_B[Char, T_B[T_B[CC_A, CC_B], CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, CC_A(_, _)), _) => 0 
  case CC_E(_, _, 12) => 1 
  case CC_E(_, _, _) => 2 
}
}