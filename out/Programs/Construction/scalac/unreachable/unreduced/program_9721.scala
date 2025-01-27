package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[T_B[CC_A, T_A], T_A], b: T_A, c: T_B[T_B[CC_A, T_A], T_A]) extends T_A
case class CC_C[C](a: (Char,CC_A), b: Byte, c: C) extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C((_,_), _, _), CC_A(CC_C(_, _, _), CC_A(_, _, _), (_,_)), _) => 0 
  case CC_A(CC_C((_,_), _, _), CC_A(CC_C(_, _, _), CC_B(_, _, _), (_,_)), _) => 1 
  case CC_A(CC_C((_,_), _, _), CC_B(_, CC_A(_, _, _), _), _) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: CC_A(CC_C((_,_), _, _), CC_B(_, CC_B(_, _, _), _), _)