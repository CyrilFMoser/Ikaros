package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E], b: E, c: T_B[F, E]) extends T_A[F, E]
case class CC_B[G]() extends T_A[G, T_B[T_B[Boolean, Boolean], (Int,Int)]]
case class CC_C[H]() extends T_A[H, T_B[T_B[Boolean, Boolean], (Int,Int)]]
case class CC_D[I](a: I, b: I, c: CC_C[I]) extends T_B[I, CC_A[CC_B[Int], (Boolean,Char)]]

val v_a: T_A[Boolean, T_B[T_B[Boolean, Boolean], (Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_A(CC_C(), _, _) => 2 
  case CC_B() => 3 
}
}
// This is not matched: CC_C()