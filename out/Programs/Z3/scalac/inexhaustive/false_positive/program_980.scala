package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D], b: T_B[D], c: Int) extends T_B[D]
case class CC_C[E, F](a: E, b: T_B[F], c: CC_B[E]) extends T_B[E]
case class CC_D(a: T_B[Boolean]) extends T_B[CC_B[Char]]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), CC_C(_, _, _), _) => 0 
  case CC_B(CC_C(_, _, _), CC_C(_, _, _), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_C(_, _, _), _, _) => 3 
  case CC_B(_, _, 12) => 4 
  case CC_B(_, CC_C(_, _, _), 12) => 5 
  case CC_B(CC_B(_, _, _), _, _) => 6 
  case CC_B(_, CC_B(_, _, _), _) => 7 
  case CC_C(0, CC_C(_, _, _), _) => 8 
  case CC_C(_, _, CC_B(_, _, _)) => 9 
  case CC_C(_, CC_D(_), CC_B(_, _, _)) => 10 
  case CC_C(_, CC_B(_, _, _), CC_B(_, _, _)) => 11 
  case CC_C(0, CC_B(_, _, _), _) => 12 
  case CC_C(0, _, _) => 13 
  case CC_C(_, CC_C(_, _, _), _) => 14 
  case CC_C(0, _, CC_B(_, _, _)) => 15 
  case CC_C(_, CC_C(_, _, _), CC_B(_, _, _)) => 16 
  case CC_C(_, CC_D(_), _) => 17 
  case CC_C(0, CC_D(_), _) => 18 
  case CC_C(0, CC_D(_), CC_B(_, _, _)) => 19 
}
}
// This is not matched: (CC_C Byte
//      Boolean
//      Wildcard
//      (CC_B Boolean Wildcard Wildcard Int (T_B Boolean))
//      (CC_B Byte Wildcard Wildcard Int (T_B Byte))
//      (T_B Byte))
// This is not matched: (CC_B Byte Boolean (T_A Byte Boolean))