package Program_31 

package Program_6 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_) => 1 
  case CC_A(CC_A(_)) => 2 
}
}
// This is not matched: (CC_A (CC_A T_A T_A T_A) Wildcard T_A)
// This is not matched: (CC_E (CC_B Boolean Boolean Boolean)
//      Wildcard
//      (T_B (T_B (CC_C Boolean Boolean Boolean Boolean) (Tuple Int Int))
//           (CC_B Boolean Boolean Boolean)))