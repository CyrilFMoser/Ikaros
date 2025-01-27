package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E, F]() extends T_B[E, F]
case class CC_C[G](a: G, b: T_A[G]) extends T_B[T_B[T_B[Char, Byte], (Char,Int)], G]
case class CC_D[H](a: Boolean, b: T_A[H]) extends T_B[T_B[T_B[Char, Byte], (Char,Int)], H]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}