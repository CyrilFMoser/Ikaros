package Program_30 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Char, b: T_A) extends T_A
case class CC_B[C]() extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)