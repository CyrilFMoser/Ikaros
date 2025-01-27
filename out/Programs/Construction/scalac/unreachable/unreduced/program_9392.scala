package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_B() extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_D[D, E]() extends T_B[D, E]
case class CC_E[F](a: Char, b: F, c: T_A[F]) extends T_B[Boolean, F]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _, _) => 1 
}
}