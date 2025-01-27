package Program_13 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C) extends T_A
case class CC_B(a: T_A, b: T_B[(Byte,Char), Byte], c: CC_A[T_A]) extends T_A
case class CC_C(a: CC_B, b: (CC_B,CC_B), c: T_A) extends T_A
case class CC_D[E, D](a: T_B[D, (Char,Char)]) extends T_B[D, E]
case class CC_E(a: Char, b: Boolean, c: CC_A[CC_C]) extends T_B[T_B[CC_B, T_A], T_B[(Boolean,Char), CC_C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_D(_), CC_A(_)) => 1 
  case CC_B(CC_B(_, _, _), _, _) => 2 
  case CC_B(CC_C(_, _, _), CC_D(_), _) => 3 
  case CC_B(_, _, CC_A(_)) => 4 
  case CC_B(CC_C(_, _, _), _, _) => 5 
  case CC_B(_, CC_D(_), _) => 6 
  case CC_B(CC_A(_), _, CC_A(_)) => 7 
  case CC_B(CC_B(_, _, _), CC_D(_), CC_A(_)) => 8 
  case CC_B(CC_C(_, _, _), _, CC_A(_)) => 9 
  case CC_B(_, _, _) => 10 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_C(_, _, _)) => 11 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), _) => 12 
  case CC_C(_, _, CC_C(_, _, _)) => 13 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_B(_, _, _)) => 14 
  case CC_C(CC_B(_, _, _), _, CC_B(_, _, _)) => 15 
  case CC_C(_, _, _) => 16 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_C Byte (T_B Byte))