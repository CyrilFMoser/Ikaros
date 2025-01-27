package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Int,Byte)) extends T_A[C]
case class CC_B(a: T_B[Int], b: T_B[Boolean]) extends T_B[Byte]
case class CC_C[D](a: Int, b: T_B[Byte], c: T_B[Boolean]) extends T_B[Boolean]
case class CC_D(a: T_A[CC_B]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_C(_, _, CC_C(_, _, _)) => 1 
  case CC_C(12, _, _) => 2 
  case CC_C(12, CC_B(_, _), CC_C(_, _, _)) => 3 
  case CC_C(_, CC_B(_, _), CC_C(_, _, _)) => 4 
  case CC_C(12, CC_B(_, _), CC_D(_)) => 5 
  case CC_C(12, _, CC_D(_)) => 6 
  case CC_C(_, _, CC_D(_)) => 7 
}
}
// This is not matched: (CC_C Boolean Wildcard Wildcard Wildcard (T_B Boolean))
// This is not matched: (CC_B Wildcard T_A)