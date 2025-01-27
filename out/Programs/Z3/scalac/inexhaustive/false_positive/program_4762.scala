package Program_14 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: T_A[B], c: T_A[C]) extends T_A[B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 3 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 4 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard Wildcard (T_A Int))
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char))