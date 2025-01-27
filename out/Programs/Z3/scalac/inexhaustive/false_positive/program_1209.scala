package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[C], b: T_B, c: T_A[C]) extends T_A[B]
case class CC_B[D](a: CC_A[D, D], b: T_B) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(_, _, CC_B(_, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _)) => 2 
  case CC_A(_, _, _) => 3 
}
}
// This is not matched: (CC_A Boolean
//      (CC_A T_B T_B T_B T_B T_B T_B)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Boolean))
// This is not matched: (CC_C Boolean (T_A Boolean (T_A Boolean Boolean)))