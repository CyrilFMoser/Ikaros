package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Byte, b: T_A[T_A[Int, Int], T_A[Int, Int]]) extends T_A[D, E]
case class CC_B[G](a: CC_A[G, CC_A[Boolean, G]], b: CC_A[G, G], c: CC_A[T_B[G], G]) extends T_B[G]
case class CC_C[H]() extends T_B[H]
case class CC_D[I](a: Byte, b: Byte, c: CC_B[I]) extends T_B[I]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)