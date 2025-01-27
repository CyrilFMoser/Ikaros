package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[T_B[T_A[Char], T_B[Char, Byte]]]
case class CC_B[E, F](a: E, b: F, c: T_B[E, E]) extends T_B[E, F]
case class CC_C[G, H](a: T_A[H]) extends T_B[G, H]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
  case CC_B(_, _, CC_C(_)) => 1 
}
}