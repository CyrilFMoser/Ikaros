package Program_30 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[D, D], b: T_B[E, E], c: Int) extends T_A[D]
case class CC_B(a: T_A[Char], b: (Byte,Int)) extends T_A[Char]
case class CC_C(a: CC_B, b: T_B[CC_B, CC_B]) extends T_B[T_B[(Char,Int), CC_B], CC_B]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Char)))