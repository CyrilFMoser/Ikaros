package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: Char) extends T_A[D]
case class CC_B() extends T_A[T_A[T_B[Char, Byte]]]
case class CC_C(a: T_A[(CC_B,Boolean)]) extends T_A[T_A[T_B[Char, Byte]]]
case class CC_D[E](a: CC_B, b: Boolean, c: CC_A[E]) extends T_B[E, CC_C]
case class CC_E[F](a: CC_C, b: CC_D[F], c: F) extends T_B[F, CC_C]
case class CC_F[G](a: G) extends T_B[G, CC_C]

val v_a: T_B[Byte, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), _, _) => 0 
  case CC_E(CC_C(CC_A(_, _, _)), CC_D(CC_B(), true, CC_A(_, _, _)), _) => 1 
  case CC_E(CC_C(CC_A(_, _, _)), CC_D(CC_B(), false, CC_A(_, _, _)), _) => 2 
  case CC_F(_) => 3 
}
}