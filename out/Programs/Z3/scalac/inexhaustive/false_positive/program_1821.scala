package Program_31 

package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
  case CC_A(_) => 1 
  case CC_B() => 2 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_B T_A T_A)