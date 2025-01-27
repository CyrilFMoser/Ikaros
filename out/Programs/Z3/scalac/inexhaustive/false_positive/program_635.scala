package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Boolean]) extends T_A[T_A[(Int,Byte)]]
case class CC_B() extends T_A[T_A[(Int,Byte)]]
case class CC_C[B](a: CC_A, b: T_A[CC_A], c: T_A[B]) extends T_A[T_A[(Int,Byte)]]

val v_a: T_A[T_A[(Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _) => 1 
  case CC_C(CC_A(_, _), _, CC_C(_, _, _)) => 2 
}
}
// This is not matched: (CC_C Boolean Wildcard Wildcard Wildcard (T_A (T_A (Tuple Int Byte))))
// This is not matched: (CC_C T_B)