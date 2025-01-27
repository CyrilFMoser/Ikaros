package Program_30 

package Program_14 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: Byte) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_A(_, _), _) => 1 
  case CC_A(CC_B(), 0) => 2 
  case CC_B() => 3 
  case CC_C(CC_B()) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants