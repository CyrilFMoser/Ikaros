package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: B) extends T_A[B]
case class CC_B[D](a: T_A[CC_A[CC_A[Int, Byte], CC_A[Int, Byte]]]) extends T_A[D]
case class CC_C[F](a: CC_B[F], b: F, c: CC_A[F, F]) extends T_A[F]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_, _)), _, CC_A(_, 'x')) => 0 
  case CC_C(CC_B(CC_A(_, _)), _, CC_A(_, _)) => 1 
  case CC_C(CC_B(CC_B(_)), _, CC_A(_, 'x')) => 2 
  case CC_C(CC_B(CC_B(_)), _, CC_A(_, _)) => 3 
  case CC_C(CC_B(CC_C(_, _, _)), _, CC_A(_, 'x')) => 4 
  case CC_C(CC_B(CC_C(_, _, _)), _, CC_A(_, _)) => 5 
}
}