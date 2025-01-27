package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C[E](a: E, b: E) extends T_A[E]
case class CC_D(a: T_A[T_A[Char]], b: T_A[T_A[Char]]) extends T_B[CC_C[T_A[Byte]]]
case class CC_E(a: CC_D) extends T_B[CC_C[T_A[Byte]]]
case class CC_F(a: Byte) extends T_B[CC_C[T_A[Byte]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
  case CC_B(CC_B(CC_C(_, _))) => 3 
  case CC_B(CC_C(_, _)) => 4 
  case CC_C(_, CC_D(_, CC_A(_, _, _))) => 5 
  case CC_C(_, CC_D(_, CC_B(_))) => 6 
  case CC_C(_, CC_D(_, CC_C(_, _))) => 7 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _, _)))