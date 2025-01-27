package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte) extends T_A[C]
case class CC_B[D](a: D) extends T_B[Boolean]
case class CC_C(a: T_A[Char]) extends T_B[Boolean]
case class CC_D(a: CC_C) extends T_B[Boolean]

val v_a: CC_B[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B (T_B Boolean)
//      (CC_D (CC_C Wildcard (T_B Boolean)) (T_B Boolean))
//      (T_B Boolean))
// This is not matched: (CC_B Wildcard T_B)
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 0 to a constant expression:
// {
//  12
// }
//