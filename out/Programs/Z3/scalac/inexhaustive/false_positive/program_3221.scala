package Program_14 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: (Char,Byte), c: T_A[F, E]) extends T_A[T_B[Char, Char], E]

val v_a: T_A[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A('x', ('x',0), CC_A(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Boolean
//      (CC_A Boolean Wildcard Wildcard (T_A Boolean))
//      Wildcard
//      (T_A Boolean))