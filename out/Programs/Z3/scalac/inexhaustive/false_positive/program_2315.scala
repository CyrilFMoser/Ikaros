package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B, c: Char) extends T_A
case class CC_B(a: T_B) extends T_B
case class CC_C(a: CC_B, b: Char) extends T_B
case class CC_D[A](a: T_B, b: CC_A, c: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B(CC_D(_, _, _)) => 1 
  case CC_C(CC_B(_), _) => 2 
  case CC_D(CC_B(_), CC_A(_, _, _), 0) => 3 
  case CC_D(_, CC_A(_, _, _), _) => 4 
  case CC_D(CC_C(_, _), CC_A(_, _, _), _) => 5 
}
}
// This is not matched: (CC_D T_A Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_A Char Wildcard (T_A Char (T_A Boolean Byte)))