package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int, b: D) extends T_A[D]
case class CC_B(a: Boolean) extends T_A[T_B[Int, T_B[Byte, Boolean]]]
case class CC_C(a: T_A[Char], b: CC_A[T_B[CC_B, CC_B]]) extends T_A[T_B[Int, T_B[Byte, Boolean]]]
case class CC_D[E](a: CC_C, b: T_A[E], c: T_A[E]) extends T_B[CC_A[T_B[CC_B, CC_C]], E]
case class CC_E[F](a: CC_C, b: CC_A[F]) extends T_B[CC_A[T_B[CC_B, CC_C]], F]

val v_a: T_B[CC_A[T_B[CC_B, CC_C]], Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_A(_, _), CC_A(_, _)), CC_A(12, _), CC_A(_, _)) => 0 
  case CC_E(_, CC_A(12, _)) => 1 
  case CC_E(_, CC_A(_, _)) => 2 
}
}
// This is not matched: CC_D(CC_C(CC_A(_, _), CC_A(_, _)), CC_A(_, _), CC_A(_, _))