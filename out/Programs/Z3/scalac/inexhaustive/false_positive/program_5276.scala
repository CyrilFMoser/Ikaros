package Program_14 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F]() extends T_A[E, D]
case class CC_B[G, H](a: T_A[G, H], b: Char, c: Byte) extends T_A[G, H]
case class CC_C[I](a: T_A[I, I], b: T_A[I, Boolean]) extends T_A[CC_A[Byte, Byte, Char], I]
case class CC_D[J](a: T_A[J, J], b: T_A[J, J], c: T_B[J]) extends T_B[J]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x', _) => 0 
  case CC_B(CC_A(), _, 0) => 1 
  case CC_B(CC_B(_, _, _), _, _) => 2 
  case CC_B(CC_A(), _, _) => 3 
  case CC_B(_, _, 0) => 4 
  case CC_B(CC_B(_, _, _), 'x', 0) => 5 
  case CC_B(CC_A(), 'x', _) => 6 
  case CC_B(CC_B(_, _, _), 'x', _) => 7 
}
}
// This is not matched: (CC_B Boolean
//      Byte
//      (CC_A Boolean Byte Boolean (T_A Boolean Byte))
//      Wildcard
//      Wildcard
//      (T_A Boolean Byte))
// This is not matched: (CC_C (T_A (CC_A T_B)))