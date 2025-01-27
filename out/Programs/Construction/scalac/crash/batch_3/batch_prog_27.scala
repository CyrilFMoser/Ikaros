package Program_27 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: (CC_A,T_A), c: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, (_,_), _))