package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C], b: Boolean) extends T_A
case class CC_B(a: T_A, b: CC_A[T_A], c: T_B[Char, (T_A,T_A)]) extends T_A
case class CC_C(a: (T_A,((Byte,Char),T_A)), b: T_A, c: Boolean) extends T_A
case class CC_D[D](a: T_A) extends T_B[D, CC_A[Boolean]]
case class CC_E[E](a: T_B[E, CC_A[Boolean]], b: CC_B, c: E) extends T_B[E, CC_A[Boolean]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 0 
  case CC_B(CC_B(_, _, _), CC_A(_, _), _) => 1 
  case CC_B(CC_C(_, _, _), CC_A(_, _), _) => 2 
  case CC_C((_,_), _, true) => 3 
  case CC_C((_,_), _, false) => 4 
}
}
// This is not matched: CC_A(_, _)