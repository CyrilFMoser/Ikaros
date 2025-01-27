package Program_13 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_B, b: T_B, c: (T_A,Char)) extends T_A
case class CC_C(a: T_A, b: T_B) extends T_B
case class CC_D[A](a: (Boolean,CC_B), b: CC_B, c: A) extends T_B
case class CC_E(a: CC_B, b: (Byte,CC_A), c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_C(_, CC_D(_, _, _)) => 1 
  case CC_C(CC_B(_, _, _), _) => 2 
  case CC_C(CC_A(), _) => 3 
  case CC_C(_, CC_E(_, _, _)) => 4 
  case CC_C(CC_B(_, _, _), CC_C(_, _)) => 5 
  case CC_C(CC_A(), CC_E(_, _, _)) => 6 
  case CC_E(CC_B(_, _, _), (_,CC_A()), CC_E(_, _, _)) => 7 
  case CC_E(_, (_,CC_A()), _) => 8 
}
}
// This is not matched: (CC_D T_A Wildcard Wildcard Wildcard T_B)
// This is not matched: Pattern match is empty without constants