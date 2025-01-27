package Program_29 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_B[T_A], c: T_B[T_A]) extends T_A
case class CC_B[B, C](a: CC_A, b: CC_A, c: T_A) extends T_B[B]
case class CC_C[D]() extends T_B[Boolean]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_B (CC_A T_A (T_B T_A) T_A T_A)
//      T_A
//      Wildcard
//      (CC_A Int Wildcard Wildcard T_A)
//      Wildcard
//      (T_B (CC_A T_A (T_B T_A) T_A T_A)))
// This is not matched: (CC_B Wildcard Wildcard T_A)