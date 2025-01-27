package Program_15 

package Program_3 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A, b: (CC_A,Byte)) extends T_A
case class CC_C[A](a: Char, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_B(_, _) => 1 
  case CC_B(_, (CC_A(_, _),_)) => 2 
  case CC_B(_, (CC_A(_, _),0)) => 3 
  case CC_A(_, CC_C(_, _)) => 4 
  case CC_A(_, _) => 5 
  case CC_A(CC_B(_, _), CC_C(_, _)) => 6 
  case CC_A(_, CC_A(_, _)) => 7 
  case CC_A(CC_B(_, _), CC_B(_, _)) => 8 
  case CC_A(CC_C(_, _), CC_A(_, _)) => 9 
  case CC_A(CC_A(_, _), CC_B(_, _)) => 10 
  case CC_A(_, CC_B(_, _)) => 11 
  case CC_C(_, _) => 12 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// This is not matched: (CC_C T_A Wildcard T_A)