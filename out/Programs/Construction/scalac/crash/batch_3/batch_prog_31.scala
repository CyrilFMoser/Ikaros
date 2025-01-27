package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F, b: E) extends T_A[E, F]
case class CC_B[G, H, I](a: T_A[I, H], b: T_A[G, G], c: T_B[CC_A[G, Char], H]) extends T_A[H, G]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: CC_B(_, _, _)