package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, F], b: T_B[T_B[E, E], F], c: T_B[F, E]) extends T_A[E, F]
case class CC_B[G, H](a: G, b: T_A[H, G], c: T_A[H, H]) extends T_A[H, G]
case class CC_C(a: Char, b: Boolean, c: T_B[Int, T_A[Boolean, Char]]) extends T_B[T_A[Int, CC_A[Char, Boolean]], Byte]
case class CC_D() extends T_B[T_A[Int, CC_A[Char, Boolean]], Byte]
case class CC_E(a: CC_D, b: T_A[T_A[CC_D, CC_C], T_A[Byte, Boolean]]) extends T_B[T_B[T_A[Byte, CC_D], CC_D], T_B[CC_B[CC_D, CC_C], T_A[Boolean, (Int,Boolean)]]]

val v_a: T_B[T_A[Int, CC_A[Char, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
}
}