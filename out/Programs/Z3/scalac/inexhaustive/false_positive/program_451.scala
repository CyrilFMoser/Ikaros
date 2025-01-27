package Program_29 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, D], b: T_A[Int, Byte]) extends T_A[C, D]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char))