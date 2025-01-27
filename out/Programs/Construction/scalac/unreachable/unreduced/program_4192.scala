package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Int],Char), b: Boolean, c: T_A[T_A[Int]]) extends T_A[T_A[Char]]
case class CC_B[D](a: Char) extends T_B[D, T_B[D, D]]
case class CC_C[E]() extends T_B[E, T_B[E, E]]
case class CC_D[F](a: T_A[F]) extends T_B[F, T_B[F, F]]

val v_a: T_B[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_) => 2 
}
}