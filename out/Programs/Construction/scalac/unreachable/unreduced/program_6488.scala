package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Byte) extends T_A[D, T_A[T_B[Char], Char]]
case class CC_B(a: CC_A[Char]) extends T_A[(CC_A[Int],Byte), T_A[T_B[Char], Char]]
case class CC_C[E](a: T_B[E]) extends T_B[E]
case class CC_D[F](a: CC_A[T_A[F, F]], b: Boolean, c: Byte) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_D(CC_A(_, _), true, _)) => 0 
  case CC_C(CC_D(CC_A(_, _), false, _)) => 1 
  case CC_D(_, _, _) => 2 
}
}
// This is not matched: CC_C(CC_C(_))