package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: D, b: T_A[T_B, D], c: C) extends T_A[D, C]
case class CC_B[E, F, G]() extends T_A[E, F]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_B(), 12) => 2 
  case CC_A(_, CC_A(_, _, _), 12) => 3 
  case CC_A(_, CC_A(_, _, _), _) => 4 
}
}
// This is not matched: (CC_B Boolean Int T_B (T_A Boolean Int))
// This is not matched: (CC_C Wildcard Wildcard T_B)