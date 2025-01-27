package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_C[H, I](a: T_A[I, I]) extends T_A[I, H]

val v_a: CC_C[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: (CC_C T_B)