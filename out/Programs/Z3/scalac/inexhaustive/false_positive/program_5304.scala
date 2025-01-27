package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G, H](a: T_A[H, H]) extends T_A[G, H]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_B Char Int (CC_B Int Int Wildcard (T_A Int Int)) (T_A Char Int))