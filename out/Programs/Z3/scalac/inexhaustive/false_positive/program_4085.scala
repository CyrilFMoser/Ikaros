package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_C[J, I]() extends T_A[I, J]
case class CC_D[L, K](a: T_A[K, K]) extends T_B[L, K]

val v_a: CC_D[Int, Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
}
}
// This is not matched: (CC_A (CC_A Int Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_A Int Boolean Boolean Boolean Boolean)))