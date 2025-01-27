package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Boolean],T_A[Byte, Byte]), b: T_A[C, T_A[C, C]], c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: Char, b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A((_,_), CC_A(_, _, _), _)) => 0 
  case CC_C(_, CC_A((_,_), CC_B(_), _)) => 1 
  case CC_C(_, CC_A((_,_), CC_C(_, _), _)) => 2 
  case CC_C(_, CC_B(_)) => 3 
  case CC_C(_, CC_C(_, CC_A(_, _, _))) => 4 
  case CC_C(_, CC_C(_, CC_B(_))) => 5 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 6 
}
}