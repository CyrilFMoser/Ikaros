package Program_30 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: Byte) extends T_A[C, T_A[C, C]]
case class CC_B(a: ((Boolean,Int),Int), b: Char) extends T_A[CC_A[Boolean, Int], T_A[CC_A[Boolean, Int], CC_A[Boolean, Int]]]

val v_a: T_A[CC_B, T_A[CC_B, CC_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
}
}
// This is not matched: (CC_A (CC_B Boolean Boolean Boolean)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (CC_B Boolean Boolean Boolean)
//           (T_A (CC_B Boolean Boolean Boolean) (CC_B Boolean Boolean Boolean))))
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))