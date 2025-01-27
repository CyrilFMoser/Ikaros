package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Int,Char)], b: T_A[T_B[Int]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: T_A[CC_A], b: T_B[Int], c: CC_A) extends T_A[T_B[T_B[Byte]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_B[T_B[Byte]]]
case class CC_D[C](a: T_B[C]) extends T_B[C]
case class CC_E[D](a: CC_B, b: CC_A) extends T_B[D]
case class CC_F[E]() extends T_B[E]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_D(CC_D(_)), CC_A(_, _)) => 1 
  case CC_B(_, CC_D(CC_F()), CC_A(_, _)) => 2 
  case CC_B(_, CC_E(CC_B(_, _, _), _), CC_A(_, _)) => 3 
  case CC_B(_, CC_F(), CC_A(_, _)) => 4 
  case CC_C(_, _) => 5 
}
}
// This is not matched: CC_B(_, CC_D(CC_E(_, _)), CC_A(_, _))