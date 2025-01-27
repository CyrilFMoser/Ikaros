package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (Byte,T_A[Int, Boolean]), b: T_A[E, E]) extends T_A[E, F]
case class CC_B[G]() extends T_A[G, T_B[G, G]]
case class CC_C[H](a: T_A[H, H], b: CC_B[H], c: T_B[H, T_A[H, H]]) extends T_B[H, T_A[H, H]]
case class CC_D[I](a: T_B[I, I], b: CC_B[I]) extends T_B[I, T_A[I, I]]

val v_a: T_B[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A((_,_), _), _, _) => 0 
  case CC_D(_, _) => 1 
}
}