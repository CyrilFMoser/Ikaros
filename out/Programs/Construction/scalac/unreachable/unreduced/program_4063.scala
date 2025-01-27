package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Boolean],T_A[Char]), b: Char, c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E, b: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_B[T_B[CC_B[Char], Byte], F]
case class CC_D[G](a: (T_B[Int, Char],(Boolean,Byte)), b: CC_A[G], c: T_A[G]) extends T_B[T_B[CC_B[Char], Byte], G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(12, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_A(_, _, _)) => 2 
  case CC_B(12, CC_B(_, CC_A(_, _, _))) => 3 
  case CC_B(12, CC_B(_, CC_B(_, _))) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 5 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_A(_, _, _)))