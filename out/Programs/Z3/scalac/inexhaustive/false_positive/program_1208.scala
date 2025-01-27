package Program_29 

package Program_10 

object Test {
sealed trait T_A
case class CC_A[A](a: Boolean, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A (Tuple (CC_C (CC_A (Tuple Wildcard Wildcard) Wildcard T_A) Wildcard T_A)
//             Wildcard)
//      Wildcard
//      T_A)