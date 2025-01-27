package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (Int,T_A[Byte, Boolean]), b: T_B[E, F]) extends T_A[E, F]
case class CC_B[G](a: T_B[G, G]) extends T_B[G, T_B[G, G]]
case class CC_C[H]() extends T_B[H, T_B[H, H]]

val v_a: T_B[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}