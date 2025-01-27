package Program_30 

package Program_4 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
  case CC_A(CC_B(), CC_A(_, _)) => 1 
  case CC_A(CC_A(_, _), _) => 2 
  case CC_B() => 3 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: Pattern match is empty without constants