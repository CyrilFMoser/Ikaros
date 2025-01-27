package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, E], b: E, c: T_A[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[G]() extends T_A[G, T_B[G, G]]
case class CC_C[H](a: T_A[CC_A[H, H], T_B[CC_A[H, H], CC_A[H, H]]], b: T_A[H, T_B[H, H]], c: H) extends T_A[H, T_B[H, H]]
case class CC_D[I](a: T_A[I, T_B[I, I]], b: T_A[I, T_B[I, I]]) extends T_B[T_A[CC_A[Int, Int], T_B[CC_A[Int, Int], CC_A[Int, Int]]], I]

val v_a: T_A[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
  case CC_C(_, _, _) => 3 
}
}