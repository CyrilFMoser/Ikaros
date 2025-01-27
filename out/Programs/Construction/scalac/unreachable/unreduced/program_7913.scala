package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[Boolean, E]
case class CC_B() extends T_A[Boolean, T_A[Boolean, CC_A[Char]]]
case class CC_C() extends T_A[Boolean, T_A[Boolean, CC_A[Char]]]

val v_a: T_A[Boolean, T_A[Boolean, CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()