package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: T_A[E, T_B[E, E]], c: (Int,T_B[Byte, Int])) extends T_A[E, T_B[E, E]]
case class CC_B[G]() extends T_A[G, T_B[G, G]]
case class CC_C[H](a: T_B[H, H]) extends T_A[H, T_B[H, H]]

val v_a: T_A[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)