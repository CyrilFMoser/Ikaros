package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_B[F, F], b: CC_A[F]) extends T_A[F, T_A[F, F]]
case class CC_C() extends T_A[T_A[CC_B[Char], CC_A[Byte]], T_A[T_A[CC_B[Char], CC_A[Byte]], T_A[CC_B[Char], CC_A[Byte]]]]
case class CC_D[G](a: T_A[G, G]) extends T_B[G, CC_C]
case class CC_E[H](a: CC_C, b: CC_C) extends T_B[H, CC_C]

val v_a: T_B[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_C(), CC_C()) => 1 
}
}