package Program_29 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[D, C], c: D) extends T_A[C, T_A[C, C]]
case class CC_B(a: Boolean) extends T_A[Char, T_A[Char, Char]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Boolean (T_A Boolean Boolean)))
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_B Boolean (Tuple Byte Char)))