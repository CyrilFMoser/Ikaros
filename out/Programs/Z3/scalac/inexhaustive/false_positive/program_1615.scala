package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[A](a: T_A, b: CC_A) extends T_A
case class CC_D(a: (CC_A,T_A)) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_D(_)) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_B Boolean))