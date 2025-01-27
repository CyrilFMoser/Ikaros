package Program_11 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: (Int,Boolean), b: T_A[C], c: T_A[C]) extends T_A[B]
case class CC_B(a: CC_A[Int, Char]) extends T_A[T_A[Byte]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A((12,_), _, _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants