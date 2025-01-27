package Program_15 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, Boolean], c: T_B) extends T_A[C, T_A[T_B, T_B]]
case class CC_B[D]() extends T_A[D, T_A[T_B, T_B]]
case class CC_C(a: T_B, b: CC_B[(Char,Byte)], c: T_B) extends T_B
case class CC_D() extends T_B
case class CC_E[E]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_C(CC_E(), CC_B(), CC_D()) => 2 
  case CC_C(CC_C(_, _, _), _, CC_C(_, _, _)) => 3 
  case CC_C(CC_E(), _, CC_E()) => 4 
  case CC_C(CC_D(), _, CC_D()) => 5 
  case CC_C(CC_D(), CC_B(), CC_C(_, _, _)) => 6 
  case CC_C(CC_D(), _, _) => 7 
  case CC_C(CC_C(_, _, _), CC_B(), CC_C(_, _, _)) => 8 
  case CC_C(CC_D(), _, CC_E()) => 9 
  case CC_C(CC_C(_, _, _), _, CC_D()) => 10 
  case CC_C(_, _, CC_D()) => 11 
  case CC_C(_, CC_B(), _) => 12 
  case CC_C(_, _, CC_E()) => 13 
  case CC_C(CC_E(), _, _) => 14 
  case CC_C(CC_E(), CC_B(), CC_C(_, _, _)) => 15 
  case CC_C(CC_C(_, _, _), CC_B(), CC_E()) => 16 
  case CC_C(_, CC_B(), CC_E()) => 17 
}
}
// This is not matched: (CC_E T_B T_B)
// This is not matched: (CC_E T_B T_B)