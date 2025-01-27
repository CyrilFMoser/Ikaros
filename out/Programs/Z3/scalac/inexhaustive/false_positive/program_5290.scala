package Program_12 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: C) extends T_A[B]

val v_a: CC_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Byte
//      (CC_A Byte Boolean Wildcard Boolean (T_A Byte))
//      Wildcard
//      (T_A Boolean))
// This is not matched: (CC_A T_A)