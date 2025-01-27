package Program_15 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: (T_A,T_A)) extends T_A
case class CC_B[A](a: T_A, b: A, c: T_A) extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, CC_C(_)) => 0 
  case CC_B(CC_B(_, _, _), _, CC_C(_)) => 1 
  case CC_B(CC_C(_), _, CC_C(_)) => 2 
}
}
// This is not matched: (CC_B Boolean
//      Wildcard
//      Wildcard
//      (CC_B T_A Wildcard Wildcard (CC_C Wildcard T_A) T_A)
//      T_A)
// This is not matched: (CC_B (CC_A T_A) T_A Wildcard (T_B (CC_A T_A) T_A))