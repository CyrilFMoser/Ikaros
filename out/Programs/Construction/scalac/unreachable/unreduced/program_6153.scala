package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: Boolean, c: T_B[E, E]) extends T_A[E, F]
case class CC_B[H, G](a: T_A[H, G], b: Char, c: T_A[G, H]) extends T_A[H, G]
case class CC_C[I](a: T_A[I, I], b: CC_B[I, I]) extends T_B[Char, I]
case class CC_D() extends T_B[Char, CC_C[T_B[Boolean, Boolean]]]
case class CC_E(a: Boolean, b: CC_A[T_B[Char, CC_D], T_B[Char, Byte]], c: CC_D) extends T_B[T_B[(CC_D,CC_D), T_B[Char, CC_D]], CC_D]

val v_a: CC_B[CC_D, CC_E] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_B(CC_B(_, _, _), _, _) => 1 
}
}