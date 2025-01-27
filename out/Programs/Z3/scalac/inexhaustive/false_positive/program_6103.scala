package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[D, D]) extends T_A[C, T_A[C, C]]
case class CC_B[E, F](a: F, b: CC_A[E, F], c: T_A[Int, E]) extends T_A[E, CC_A[E, E]]
case class CC_C(a: CC_A[Int, Byte], b: CC_A[Char, Char]) extends T_A[CC_B[Char, Byte], CC_A[CC_B[Char, Byte], CC_B[Char, Byte]]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char (T_A Char Char)))
// This is not matched: Pattern match is empty without constants