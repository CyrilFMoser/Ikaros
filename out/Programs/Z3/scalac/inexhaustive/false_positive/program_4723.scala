package Program_15 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[A](a: CC_B, b: CC_B, c: Boolean) extends T_B
case class CC_D(a: CC_C[CC_A], b: T_A, c: CC_C[(Char,Char)]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E() => 1 
  case CC_D(_, CC_B(), CC_C(_, _, _)) => 2 
  case CC_D(CC_C(_, _, _), _, CC_C(_, _, _)) => 3 
  case CC_D(CC_C(_, _, _), CC_A(), _) => 4 
  case CC_D(CC_C(_, _, _), _, _) => 5 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Byte))