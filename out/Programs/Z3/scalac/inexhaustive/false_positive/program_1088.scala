package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(Char,Int), E]
case class CC_B[F]() extends T_B[F, Char]
case class CC_C[G](a: T_A[G, G], b: T_B[G, G]) extends T_B[G, Char]

val v_a: T_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Int)))