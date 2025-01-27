package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, E], b: T_B[D]) extends T_A[E, D]
case class CC_B[F](a: F, b: Byte) extends T_A[T_A[Int, T_A[Char, Byte]], F]
case class CC_C[G](a: T_A[G, G], b: G) extends T_A[T_A[Int, T_A[Char, Byte]], G]
case class CC_D(a: (CC_B[Int],CC_B[Char]), b: T_A[T_A[Byte, Char], (Int,Char)]) extends T_B[T_A[T_B[Byte], (Int,Boolean)]]

val v_a: T_A[T_A[Int, T_A[Char, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _)