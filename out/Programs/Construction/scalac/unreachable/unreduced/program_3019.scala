package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Int], b: Char, c: T_A[T_A[Boolean]]) extends T_A[Int]
case class CC_B(a: CC_A, b: Byte) extends T_A[Int]
case class CC_C(a: CC_B, b: T_B[CC_B]) extends T_A[Int]
case class CC_D[C](a: (Int,T_B[CC_A]), b: CC_C) extends T_B[C]
case class CC_E[D](a: CC_C, b: CC_C) extends T_B[D]
case class CC_F[E]() extends T_B[E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C(_, _) => 2 
}
}