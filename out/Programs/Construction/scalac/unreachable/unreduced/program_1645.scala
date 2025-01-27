package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_A[T_B, C]], b: T_B) extends T_A[T_B, C]
case class CC_B[D](a: CC_A[D], b: CC_A[D]) extends T_A[T_B, D]
case class CC_C[E](a: T_A[E, CC_B[E]]) extends T_B
case class CC_D(a: (T_A[T_B, T_B],T_A[T_B, T_B]), b: T_A[T_A[T_B, Boolean], T_A[T_B, T_B]]) extends T_B
case class CC_E(a: Byte, b: CC_B[T_B], c: T_A[T_A[CC_D, Byte], Byte]) extends T_B

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_)) => 0 
  case CC_A(_, CC_D(_, _)) => 1 
  case CC_A(_, CC_E(_, _, _)) => 2 
  case CC_B(_, _) => 3 
}
}