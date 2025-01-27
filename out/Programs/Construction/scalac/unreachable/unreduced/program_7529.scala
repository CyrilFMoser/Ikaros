package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Int,Char), T_A[Boolean]]) extends T_A[T_A[Int]]
case class CC_B[D](a: (T_B[(Int,Byte), CC_A],CC_A), b: Char) extends T_A[D]
case class CC_C[E](a: Boolean, b: T_A[T_A[CC_A]]) extends T_A[E]
case class CC_D[F, G]() extends T_B[T_A[F], F]
case class CC_E(a: T_A[T_B[CC_A, Int]], b: T_A[CC_D[CC_A, Char]], c: Char) extends T_B[T_A[CC_C[T_A[CC_A]]], CC_C[T_A[CC_A]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B((_,_), _)) => 0 
  case CC_C(_, CC_C(_, CC_B(_, _))) => 1 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 2 
}
}
// This is not matched: CC_B((_,CC_A(_)), _)