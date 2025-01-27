package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, F]() extends T_A[G, F]
case class CC_C[H, I](a: T_A[I, I]) extends T_A[I, H]

val v_a: CC_C[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_C T_B)