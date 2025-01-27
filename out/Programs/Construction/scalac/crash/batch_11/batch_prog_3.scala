package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[Int]
case class CC_B[C](a: T_B[C]) extends T_A[C]
case class CC_C(a: CC_B[CC_A], b: Byte, c: T_A[CC_B[CC_A]]) extends T_A[Int]
case class CC_D() extends T_B[T_B[T_A[CC_A]]]
case class CC_E[D]() extends T_B[T_B[T_A[CC_A]]]
case class CC_F[E](a: T_A[E], b: Int, c: T_A[E]) extends T_B[E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(CC_F(_, _, _))) => 0 
  case CC_B(CC_F(_, _, _)) => 1 
  case CC_C(_, _, CC_B(CC_F(_, _, _))) => 2 
}
}