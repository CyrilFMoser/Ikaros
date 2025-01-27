package Program_29 

package Program_5 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: Byte) extends T_A

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(_, CC_A(_, _, _), 0) => 2 
}
}
// This is not matched: (CC_A Byte
//      (CC_A (CC_A Boolean T_A T_A T_A T_A) Wildcard Wildcard Byte T_A)
//      (CC_A T_A Wildcard Wildcard Byte T_A)
//      Byte
//      T_A)
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)