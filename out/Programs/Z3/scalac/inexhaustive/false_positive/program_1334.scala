package Program_31 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_B, b: T_B) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: Byte, b: T_A) extends T_B
case class CC_E(a: T_B, b: CC_C, c: Char) extends T_B
case class CC_F[A]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_F() => 0 
  case CC_D(_, _) => 1 
  case CC_D(0, CC_A()) => 2 
  case CC_E(_, CC_C(_), 'x') => 3 
  case CC_E(CC_D(_, _), _, _) => 4 
  case CC_E(CC_E(_, _, _), _, 'x') => 5 
  case CC_E(_, CC_C(_), _) => 6 
  case CC_E(CC_F(), CC_C(_), _) => 7 
  case CC_E(CC_E(_, _, _), _, _) => 8 
  case CC_E(CC_F(), CC_C(_), 'x') => 9 
}
}
// This is not matched: (CC_F T_A T_B)
// This is not matched: Pattern match is empty without constants