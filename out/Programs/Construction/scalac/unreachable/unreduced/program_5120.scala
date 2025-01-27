package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Byte, Boolean], Char], C]
case class CC_B[D, E](a: CC_A[D]) extends T_A[T_A[T_A[Byte, Boolean], Char], D]
case class CC_C[F](a: F) extends T_A[T_A[T_A[Byte, Boolean], Char], F]

val v_a: T_A[T_A[T_A[Byte, Boolean], Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(0) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_B(CC_A(_, _, _))