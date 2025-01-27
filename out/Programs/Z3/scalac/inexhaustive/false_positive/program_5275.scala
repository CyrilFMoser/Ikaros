package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F]() extends T_A[E, D]
case class CC_B[G, H](a: T_A[G, H], b: Char, c: Byte) extends T_A[G, H]
case class CC_C[I](a: T_A[I, I], b: T_A[I, Boolean]) extends T_A[CC_A[Byte, Byte, Char], I]
case class CC_D[J](a: T_A[J, J], b: T_A[J, J], c: T_B[J]) extends T_B[J]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), 'x', 0) => 0 
  case CC_B(CC_B(_, _, _), _, 0) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_C (T_A (CC_A T_B)))