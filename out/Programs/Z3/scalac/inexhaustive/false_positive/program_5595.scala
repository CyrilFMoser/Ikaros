package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,(Boolean,Boolean)), b: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), _) => 0 
}
}
// This is not matched: (CC_D Wildcard Wildcard (T_B (T_A Int)))