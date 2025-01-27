package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B], c: B) extends T_A[(Int,Boolean)]
case class CC_B[C](a: CC_A[C], b: T_A[C]) extends T_A[(Int,Boolean)]

val v_a: T_A[(Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _), _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_A(_, _, _), CC_B(_, _)) => 2 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 3 
  case CC_B(CC_A(_, _, _), _) => 4 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (Tuple Int Boolean)))
// This is not matched: (CC_C Wildcard (CC_B T_A) T_A)