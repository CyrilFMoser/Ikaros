package Program_31 

package Program_11 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A]() extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B()) => 1 
  case CC_A(_) => 2 
  case CC_C(CC_B()) => 3 
  case CC_C(_) => 4 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_B Wildcard T_A)