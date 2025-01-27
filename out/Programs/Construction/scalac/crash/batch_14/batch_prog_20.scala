package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A, b: Byte) extends T_A
case class CC_C(a: CC_B, b: T_B[(CC_A,(Char,Int)), T_B[T_A, CC_A]]) extends T_A
case class CC_D[C, D](a: D, b: T_A) extends T_B[C, D]
case class CC_E[E](a: T_B[E, E], b: Char, c: T_B[E, CC_C]) extends T_B[E, CC_C]
case class CC_F[G, F](a: Byte, b: G, c: CC_C) extends T_B[F, G]

val v_a: CC_F[CC_B, Byte] = null
val v_b: Int = v_a match{
  case CC_F(_, _, CC_C(_, _)) => 0 
}
}