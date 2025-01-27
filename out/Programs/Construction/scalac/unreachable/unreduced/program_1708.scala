package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[T_A[E, Char], E], c: T_A[E, E]) extends T_A[E, Char]
case class CC_B[F, G]() extends T_B[F, G]
case class CC_C[H](a: Byte) extends T_B[H, T_A[H, H]]
case class CC_D[I](a: I, b: T_A[I, I], c: CC_B[Byte, I]) extends T_B[I, T_A[I, I]]

val v_a: T_B[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(0) => 1 
  case CC_D(true, _, _) => 2 
  case CC_D(false, _, _) => 3 
}
}
// This is not matched: CC_C(_)