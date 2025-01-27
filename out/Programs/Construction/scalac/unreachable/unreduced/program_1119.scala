package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Boolean) extends T_A[E, D]
case class CC_B[G, F](a: T_B[F], b: T_B[G]) extends T_A[F, G]
case class CC_C[I, H](a: T_A[H, H], b: Int, c: T_A[H, I]) extends T_A[H, I]
case class CC_D(a: ((Char,Byte),(Int,Boolean))) extends T_B[T_A[Byte, T_A[Int, Boolean]]]
case class CC_E(a: Byte, b: CC_C[Boolean, T_A[CC_D, CC_D]], c: CC_A[T_A[CC_D, CC_D], Byte]) extends T_B[T_A[Byte, T_A[Int, Boolean]]]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}