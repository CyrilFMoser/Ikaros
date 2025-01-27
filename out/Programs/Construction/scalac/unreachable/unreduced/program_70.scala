package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_B[E](a: Int, b: T_A[E]) extends T_A[E]
case class CC_C[F](a: Int, b: T_B[F]) extends T_A[F]
case class CC_D(a: CC_A[T_A[Int], Char], b: T_A[(Boolean,Byte)], c: CC_A[CC_C[Int], CC_B[Boolean]]) extends T_B[T_A[T_A[Int]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_, _)) => 3 
}
}
// This is not matched: CC_C(_, _)