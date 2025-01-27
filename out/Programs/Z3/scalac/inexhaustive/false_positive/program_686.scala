package Program_31 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B, c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_B
case class CC_C(a: CC_B) extends T_B
case class CC_D[A](a: Char, b: T_A, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_) => 1 
  case CC_D(_, _, CC_C(_)) => 2 
  case CC_D(_, CC_A(_, _, _), CC_C(_)) => 3 
  case CC_D('x', _, _) => 4 
  case CC_D('x', CC_A(_, _, _), CC_C(_)) => 5 
  case CC_D(_, CC_A(_, _, _), _) => 6 
}
}
// This is not matched: (CC_D T_A Wildcard (CC_A Wildcard Wildcard Wildcard T_A) Wildcard T_B)
// This is not matched: Pattern match is empty without constants