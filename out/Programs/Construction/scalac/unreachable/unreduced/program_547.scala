package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Int], (Char,Int)]]
case class CC_B[D, E]() extends T_A[D, T_A[T_A[Char, Int], (Char,Int)]]
case class CC_C[F](a: CC_B[F, F]) extends T_A[F, T_A[T_A[Char, Int], (Char,Int)]]

val v_a: T_A[Boolean, T_A[T_A[Char, Int], (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(true, _, _) => 0 
  case CC_A(false, _, _) => 1 
  case CC_B() => 2 
  case CC_C(_) => 3 
}
}