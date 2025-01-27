package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]], b: Char, c: T_B[T_A[Int], T_B[Int, Int]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B[D]() extends T_A[T_A[T_A[Byte]]]
case class CC_C[E, F](a: F, b: Boolean, c: CC_B[F]) extends T_B[E, F]
case class CC_D[G](a: T_A[G]) extends T_B[G, T_B[G, G]]

val v_a: T_B[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, CC_B()), true, _) => 0 
  case CC_C(CC_C(_, _, CC_B()), false, _) => 1 
  case CC_D(_) => 2 
}
}