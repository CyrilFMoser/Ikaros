package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C[D](a: (CC_B,CC_B), b: T_B[Char]) extends T_B[D]
case class CC_D[E]() extends T_B[E]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D()) => 0 
}
}
// This is not matched: Pattern match is empty without constants