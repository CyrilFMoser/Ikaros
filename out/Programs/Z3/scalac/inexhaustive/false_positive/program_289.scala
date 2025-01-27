package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: T_A[B]) extends T_A[B]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Int
//      Char
//      Wildcard
//      (CC_A Int Boolean Wildcard Wildcard (T_A Int))
//      (T_A Int))
// This is not matched: (CC_A Wildcard Wildcard T_A)