package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A
case class CC_B[A]() extends T_A
case class CC_C(a: CC_B[CC_A], b: T_A, c: T_A) extends T_A
case class CC_D(a: CC_B[Byte], b: CC_C) extends T_B
case class CC_E(a: (Byte,Boolean), b: (T_B,T_B)) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_E(_, _)) => 1 
  case CC_A(CC_D(_, _), CC_D(_, _)) => 2 
  case CC_A(_, _) => 3 
  case CC_A(CC_E(_, _), CC_E(_, _)) => 4 
  case CC_A(CC_D(_, _), _) => 5 
  case CC_A(_, CC_D(_, _)) => 6 
  case CC_A(CC_E(_, _), _) => 7 
  case CC_A(CC_D(_, _), CC_E(_, _)) => 8 
  case CC_C(CC_B(), CC_A(_, _), CC_B()) => 9 
  case CC_C(CC_B(), _, _) => 10 
  case CC_C(_, CC_B(), CC_B()) => 11 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_B T_A T_A)