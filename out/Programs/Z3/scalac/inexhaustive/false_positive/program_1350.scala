package Program_31 

package Program_14 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A) extends T_A
case class CC_B(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_A(_, CC_B(_)) => 2 
  case CC_A(_, CC_A(_, _)) => 3 
}
}
// This is not matched: (CC_B (CC_A Boolean
//            Boolean
//            (CC_A Boolean Boolean (CC_B (CC_B (CC_B Wildcard T_A) T_A) T_A) T_A)
//            T_A)
//      T_A)
// This is not matched: (CC_B Wildcard T_A)