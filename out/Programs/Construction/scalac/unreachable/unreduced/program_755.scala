package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G, H](a: T_B[H, G]) extends T_A[H, G]
case class CC_C[I](a: T_B[I, T_A[Int, I]], b: T_A[I, I], c: CC_B[I, I]) extends T_B[I, Boolean]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}