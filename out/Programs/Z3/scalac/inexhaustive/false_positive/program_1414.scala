package Program_30 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[B](a: CC_A, b: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, 12) => 2 
  case CC_C(CC_A(), _) => 3 
  case CC_C(CC_A(), 12) => 4 
  case CC_C(_, _) => 5 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B T_A Wildcard T_A)