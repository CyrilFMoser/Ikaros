package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[Boolean, Boolean], b: T_A[C, C]) extends T_A[C, D]
case class CC_B[F, E, G](a: F, b: T_A[E, G]) extends T_A[F, E]
case class CC_C(a: T_A[Byte, Boolean], b: CC_B[Int, Byte, Boolean]) extends T_A[Boolean, T_A[Int, Char]]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_B('x', CC_B(_, _)) => 1 
  case CC_B('x', CC_A(_, _)) => 2 
  case CC_B(_, _) => 3 
  case CC_A(CC_A(_, _), CC_B(_, _)) => 4 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 5 
  case CC_A(CC_B(_, _), CC_A(_, _)) => 6 
  case CC_A(CC_A(_, _), _) => 7 
  case CC_A(CC_B(_, _), CC_B(_, _)) => 8 
  case CC_A(_, CC_A(_, _)) => 9 
  case CC_A(CC_B(_, _), _) => 10 
}
}
// This is not matched: (CC_B Char Byte Boolean Wildcard Wildcard (T_A Char Byte))
// This is not matched: (CC_B Char Byte Boolean Wildcard Wildcard (T_A Char Byte))