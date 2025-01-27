package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B, C](a: (T_A,T_A)) extends T_B[B]
case class CC_C[D](a: Char, b: T_B[D], c: (CC_A,CC_A)) extends T_B[T_B[T_A]]

val v_a: T_B[T_B[T_A]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C('x', _, _) => 1 
  case CC_C(_, _, (CC_A(),CC_A())) => 2 
  case CC_C('x', CC_B(_), (CC_A(),CC_A())) => 3 
  case CC_C(_, CC_B(_), _) => 4 
}
}
// This is not matched: (CC_C T_A Char Wildcard Wildcard (T_B (T_B T_A)))
// This is not matched: (CC_A (CC_A Wildcard Wildcard Wildcard T_A)
//      (CC_A Wildcard Wildcard Wildcard T_A)
//      Wildcard
//      T_A)