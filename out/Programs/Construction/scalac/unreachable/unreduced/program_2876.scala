package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Boolean,Byte)]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[Int], b: CC_A, c: Char) extends T_A[T_A[T_A[Int]]]
case class CC_C[C](a: T_A[C]) extends T_B[C]
case class CC_D[D, E](a: CC_A) extends T_B[D]
case class CC_E[F](a: T_B[F], b: T_B[F]) extends T_B[F]

val v_a: T_B[T_A[T_A[T_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(CC_C(_))) => 1 
  case CC_D(CC_A(CC_D(_))) => 2 
  case CC_D(CC_A(CC_E(_, _))) => 3 
  case CC_E(CC_C(_), _) => 4 
  case CC_E(CC_D(CC_A(_)), _) => 5 
  case CC_E(CC_E(CC_C(_), CC_C(_)), _) => 6 
  case CC_E(CC_E(CC_C(_), CC_D(_)), _) => 7 
  case CC_E(CC_E(CC_C(_), CC_E(_, _)), _) => 8 
  case CC_E(CC_E(CC_D(_), CC_C(_)), _) => 9 
  case CC_E(CC_E(CC_D(_), CC_D(_)), _) => 10 
  case CC_E(CC_E(CC_D(_), CC_E(_, _)), _) => 11 
  case CC_E(CC_E(CC_E(_, _), CC_C(_)), _) => 12 
  case CC_E(CC_E(CC_E(_, _), CC_D(_)), _) => 13 
  case CC_E(CC_E(CC_E(_, _), CC_E(_, _)), _) => 14 
}
}