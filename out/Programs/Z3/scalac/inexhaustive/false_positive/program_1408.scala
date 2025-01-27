package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B, b: T_A[C], c: T_A[B]) extends T_A[B]
case class CC_B[D](a: T_B, b: CC_A[D, D], c: (T_B,T_B)) extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_A(_, _, _) => 3 
}
}
// This is not matched: (CC_A Byte (T_A T_B) Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_A Byte (T_A T_B) Wildcard Wildcard Wildcard (T_A Byte))