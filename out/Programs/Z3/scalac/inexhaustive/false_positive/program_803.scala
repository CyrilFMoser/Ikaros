package Program_31 

package Program_13 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B[A](a: Int, b: Int, c: CC_A) extends T_A
case class CC_C(a: CC_B[T_A], b: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(12, _, CC_A()) => 1 
  case CC_B(12, 12, _) => 2 
  case CC_B(_, 12, CC_A()) => 3 
  case CC_B(_, _, _) => 4 
  case CC_B(12, 12, CC_A()) => 5 
  case CC_B(_, 12, _) => 6 
  case CC_C(_, _) => 7 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants