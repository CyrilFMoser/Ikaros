package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_B[Int]]) extends T_A[T_B[Int]]
case class CC_B(a: Int, b: CC_A, c: T_B[Byte]) extends T_A[T_B[Int]]
case class CC_C(a: T_A[CC_A], b: T_A[T_B[Int]]) extends T_A[T_B[Int]]
case class CC_D[C](a: CC_A) extends T_B[C]
case class CC_E[D](a: D) extends T_B[D]
case class CC_F[E]() extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, CC_A(_, _))) => 0 
  case CC_D(CC_A(_, CC_B(_, _, _))) => 1 
  case CC_D(CC_A(_, CC_C(_, _))) => 2 
  case CC_E(CC_A(_, _)) => 3 
  case CC_F() => 4 
}
}