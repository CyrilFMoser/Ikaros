package Program_15 

package Program_8 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: Char, c: Int) extends T_A
case class CC_C[A](a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A()) => 1 
  case CC_B(_, 'x', _) => 2 
  case CC_B(_, _, _) => 3 
  case CC_B(CC_A(), 'x', _) => 4 
  case CC_B(CC_A(), _, _) => 5 
  case CC_B(CC_A(), 'x', 12) => 6 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)
// This is not matched: (CC_F T_B)