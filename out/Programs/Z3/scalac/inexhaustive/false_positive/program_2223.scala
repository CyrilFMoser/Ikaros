package Program_30 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: (T_B,Byte)) extends T_A[T_A[T_B, Byte], T_A[Char, T_B]]
case class CC_B(a: Byte) extends T_B

val v_a: T_A[T_A[T_B, Byte], T_A[Char, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), (CC_B(_),0)) => 0 
  case CC_A(_, (CC_B(_),0)) => 1 
  case CC_A(_, (CC_B(_),_)) => 2 
  case CC_A(CC_B(_), (CC_B(_),_)) => 3 
}
}
// This is not matched: (CC_A T_B Wildcard Wildcard (T_A (T_A T_B Byte) (T_A Char T_B)))
// This is not matched: (CC_B (T_A (T_A Char)))