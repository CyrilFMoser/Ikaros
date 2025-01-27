package Program_15 

package Program_3 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A, c: A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_C(_), _) => 1 
  case CC_A(_, _, _) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B T_A)