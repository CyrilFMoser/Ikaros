package Program_14 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[Int]
case class CC_B[D](a: Char, b: T_A[D]) extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Char Char Char Wildcard (T_A Char (T_A Boolean (Tuple Byte Int))))