package Program_30 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: B) extends T_A[Byte]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(_, 0, 0) => 1 
}
}
// This is not matched: (CC_A Byte
//      (CC_A Boolean Wildcard Boolean Wildcard (T_A Byte))
//      Wildcard
//      Wildcard
//      (T_A Byte))
// This is not matched: (CC_B (Tuple (CC_B Wildcard Wildcard T_A) (CC_A Boolean Wildcard T_A))
//      Wildcard
//      T_A)