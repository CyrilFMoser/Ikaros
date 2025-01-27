package Program_15 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: C, b: T_A[Int, E]) extends T_A[C, D]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Byte Byte Boolean Wildcard Wildcard (T_A Byte Byte))
// This is not matched: (CC_A Char Wildcard (T_A Char))