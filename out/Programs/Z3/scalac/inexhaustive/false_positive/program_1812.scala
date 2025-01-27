package Program_30 

package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[B]) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A Char
//      (CC_A Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)