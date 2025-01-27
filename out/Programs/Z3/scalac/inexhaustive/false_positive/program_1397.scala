package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[Char, E], b: T_A[C, C], c: T_A[E, C]) extends T_A[D, C]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A Byte Int (T_A Boolean Boolean) Wildcard Wildcard Wildcard (T_A Byte Int))
// This is not matched: Pattern match is empty without constants