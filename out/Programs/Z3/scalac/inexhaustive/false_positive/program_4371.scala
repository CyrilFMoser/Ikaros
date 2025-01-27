package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_B[E]() extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_E[I](a: T_A[I]) extends T_B[Byte, I]

val v_a: CC_E[Byte] = null
val v_b: Int = v_a match{
  case CC_E(CC_C()) => 0 
}
}
// This is not matched: (CC_B Int
//      (CC_A Int Wildcard Int (T_A (T_A Char Int) Int))
//      Int
//      (T_A (T_A Char Int) Int))