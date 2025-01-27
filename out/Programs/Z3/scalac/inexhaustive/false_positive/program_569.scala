package Program_30 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: Byte) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_A, b: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(0) => 1 
  case CC_C(CC_A(_), 12) => 2 
  case CC_C(_, _) => 3 
  case CC_C(CC_B(_), _) => 4 
  case CC_C(CC_B(_), 12) => 5 
  case CC_C(_, 12) => 6 
  case CC_C(CC_C(_, _), 12) => 7 
  case CC_B(_) => 8 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_B Wildcard
//      (CC_A Char Byte Boolean (T_A Char Byte))
//      Wildcard
//      (T_A (CC_A Byte Boolean Byte Boolean) (Tuple Boolean Boolean)))