package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,Boolean), b: T_A[C, C], c: C) extends T_A[C, T_B]
case class CC_B(a: T_B, b: T_B, c: CC_A[T_B]) extends T_B
case class CC_C(a: CC_B, b: CC_A[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(_, CC_C(_, _), _), CC_A((_,_), _, CC_B(_, _, _))) => 1 
}
}
// This is not matched: CC_C(CC_B(_, CC_B(_, _, _), _), CC_A((_,_), _, CC_B(_, _, _)))