package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, H](a: T_A[H, H]) extends T_A[G, H]
case class CC_C[I, J]() extends T_A[I, J]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_B Char Int (CC_B Int Int Wildcard (T_A Int Int)) (T_A Char Int))