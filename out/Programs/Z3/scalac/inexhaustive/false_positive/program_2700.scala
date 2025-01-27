package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[Char], b: (Int,Boolean)) extends T_A[B]
case class CC_B[D](a: Byte, b: T_A[D], c: (Boolean,Boolean)) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), (12,_)) => 0 
  case CC_A(CC_B(_, _, _), (12,_)) => 1 
  case CC_A(_, _) => 2 
  case CC_B(_, CC_B(_, _, _), _) => 3 
  case CC_B(_, CC_B(_, _, _), (_,_)) => 4 
  case CC_B(0, _, _) => 5 
  case CC_B(_, _, (_,_)) => 6 
}
}
// This is not matched: (CC_A Boolean (T_A Boolean) Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_A Wildcard T_A)