package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B, b: Boolean, c: T_B) extends T_A[B]
case class CC_B(a: T_A[T_B], b: CC_A[T_B, (Char,Byte)], c: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_C(a: Int) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), _, _) => 0 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_B(_, CC_A(_, _, _), _) => 2 
  case CC_B(_, _, _) => 3 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_B(_, _, CC_A(_, _, _)) => 5 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), _) => 6 
  case CC_B(CC_A(_, _, _), _, _) => 7 
}
}
// This is not matched: (CC_A (T_A T_B) T_B Wildcard Wildcard Wildcard (T_A (T_A T_B)))
// This is not matched: (CC_B Wildcard
//      (CC_B Wildcard (CC_B Wildcard Wildcard (T_B T_A)) (T_B T_A))
//      (T_B T_A))