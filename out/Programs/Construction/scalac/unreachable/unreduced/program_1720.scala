package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[E, T_A[T_B[Int, Char], Byte]]
case class CC_B[F]() extends T_A[F, T_A[T_B[Int, Char], Byte]]
case class CC_C[G]() extends T_A[G, T_A[T_B[Int, Char], Byte]]
case class CC_D[I, H](a: I, b: T_B[H, CC_A[H]], c: T_A[I, H]) extends T_B[H, I]
case class CC_E(a: T_B[CC_A[(Boolean,Char)], CC_D[Int, Boolean]], b: T_B[CC_A[Int], CC_A[Boolean]]) extends T_B[Byte, CC_C[T_A[Char, Int]]]

val v_a: T_A[CC_E, T_A[T_B[Int, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()