package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Int,Boolean)) extends T_A[T_A[(Int,Char)]]
case class CC_B(a: CC_A) extends T_A[T_A[(Int,Char)]]
case class CC_C[B](a: Byte, b: T_A[B]) extends T_A[T_A[CC_A]]

val v_a: T_A[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
  case CC_C(_, CC_B(_)) => 1 
  case CC_C(0, CC_C(_, _)) => 2 
  case CC_C(_, _) => 3 
  case CC_C(_, CC_A(_)) => 4 
  case CC_C(0, CC_A(_)) => 5 
}
}
// This is not matched: (CC_C Byte Wildcard Wildcard (T_A (T_A (CC_A Boolean (T_A Boolean)))))
// This is not matched: (CC_B Byte (T_A Byte))