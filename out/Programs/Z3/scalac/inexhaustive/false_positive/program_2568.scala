package Program_30 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B, b: B) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: T_B, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
  case CC_C(CC_C(_, _), CC_C(_, _)) => 1 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard T_B)
// This is not matched: (CC_B T_A T_A)