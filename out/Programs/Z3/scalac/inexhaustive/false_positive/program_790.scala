package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Byte, c: T_A[Char]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A (CC_A Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_A (T_A (Tuple Byte Int)))