package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B[D](a: T_A[D, D], b: T_A[T_A[T_B, Byte], Byte], c: Int) extends T_A[D, Byte]
case class CC_C[F](a: CC_A[F]) extends T_A[CC_B[T_A[T_B, T_B]], F]
case class CC_D(a: Boolean, b: CC_C[Int], c: T_A[CC_C[T_B], Byte]) extends T_B
case class CC_E(a: CC_A[CC_C[T_B]], b: Boolean) extends T_B

val v_a: T_A[CC_B[T_A[T_B, T_B]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), _, CC_A(CC_B(_, _, _), _, _)) => 0 
  case CC_A(CC_B(_, _, _), _, CC_B(CC_C(_), CC_A(_, _, _), _)) => 1 
  case CC_A(CC_B(_, _, _), _, CC_B(CC_C(_), CC_B(_, _, _), _)) => 2 
  case CC_A(CC_B(_, _, _), _, CC_C(_)) => 3 
  case CC_C(CC_A(_, _, _)) => 4 
}
}
// This is not matched: CC_B(_, _, _)