package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_C(a: T_A, b: T_B[T_A, CC_A]) extends T_A
case class CC_E[E, D]() extends T_B[D, E]
case class CC_F[G, F]() extends T_B[G, F]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_E()) => 0 
}
}
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char Int))