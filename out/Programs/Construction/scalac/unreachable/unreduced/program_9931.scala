package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[Byte]) extends T_A[T_A[T_A[Int, Byte], (Byte,Int)], Byte]
case class CC_B[D, E](a: D, b: CC_A, c: T_A[D, D]) extends T_B[D]
case class CC_C[F](a: T_B[F]) extends T_B[F]
case class CC_D[G](a: T_A[G, G]) extends T_B[G]

val v_a: T_A[T_A[T_A[Int, Byte], (Byte,Int)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_B(_, _, _))) => 0 
  case CC_A(CC_C(CC_C(_))) => 1 
  case CC_A(CC_C(CC_D(_))) => 2 
  case CC_A(CC_D(_)) => 3 
}
}
// This is not matched: CC_A(CC_B(_, CC_A(_), _))