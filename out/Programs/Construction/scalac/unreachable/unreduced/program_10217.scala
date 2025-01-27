package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, Int]], b: Boolean) extends T_A[Char]
case class CC_B[E, D](a: CC_A, b: T_A[E]) extends T_B[E, D]
case class CC_C[G, F](a: T_B[G, T_B[G, G]], b: CC_A, c: Boolean) extends T_B[F, G]

val v_a: T_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C(CC_C(_, _, _), _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, CC_A(_, _)), _, _)