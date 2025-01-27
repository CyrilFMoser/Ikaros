package Program_15 

package Program_4 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Int, c: T_A) extends T_A
case class CC_B[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_A(CC_B(), _, _) => 2 
  case CC_A(CC_A(_, _, _), 12, CC_B()) => 3 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 4 
  case CC_A(_, 12, CC_A(_, _, _)) => 5 
  case CC_A(CC_A(_, _, _), _, _) => 6 
  case CC_A(_, 12, _) => 7 
}
}
// This is not matched: (CC_A (CC_B T_A T_A) Wildcard (CC_B T_A T_A) T_A)
// This is not matched: (CC_A (T_A (T_B (Tuple Byte Char))))