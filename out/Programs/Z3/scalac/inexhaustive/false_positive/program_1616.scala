package Program_31 

package Program_11 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Byte, c: T_A) extends T_A
case class CC_B[A]() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 0, _) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_A(_, 0, _) => 2 
  case CC_A(_, _, CC_B()) => 3 
}
}
// This is not matched: (CC_A Wildcard Wildcard (CC_B T_A T_A) T_A)
// This is not matched: Pattern match is empty without constants