package Program_13 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[Int], b: T_A[B]) extends T_A[B]
case class CC_B[D]() extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_A(CC_A(_, _), CC_B()) => 2 
  case CC_A(_, _) => 3 
}
}
// This is not matched: (CC_A Byte (CC_B Boolean Boolean) Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_A Wildcard Wildcard T_A)