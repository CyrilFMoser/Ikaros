package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Int,(Byte,Int)), b: T_A[B]) extends T_A[B]
case class CC_B[C](a: CC_A[C]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A((_,(_,_)), _) => 1 
  case CC_A(_, CC_A(_, _)) => 2 
  case CC_A((_,(_,_)), CC_A(_, _)) => 3 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_B Boolean Wildcard (T_A (T_A Byte)))