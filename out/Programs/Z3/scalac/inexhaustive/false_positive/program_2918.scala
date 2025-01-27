package Program_15 

package Program_8 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B[A](a: (T_A,T_A), b: T_A, c: A) extends T_A
case class CC_C(a: (T_A,CC_A), b: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((CC_A(),CC_A()), CC_B(_, _, _)) => 0 
  case CC_C((CC_A(),CC_A()), _) => 1 
  case CC_C(_, CC_A()) => 2 
  case CC_C((CC_B(_, _, _),CC_A()), CC_B(_, _, _)) => 3 
  case CC_C((CC_B(_, _, _),CC_A()), _) => 4 
  case CC_C(_, CC_C(_, _)) => 5 
}
}
// This is not matched: (CC_C (Tuple (CC_C Wildcard (CC_A T_A) T_A) (CC_A T_A))
//      (CC_B Boolean Wildcard Wildcard Boolean T_A)
//      T_A)
// This is not matched: (CC_C Wildcard (T_A (T_A Boolean)))