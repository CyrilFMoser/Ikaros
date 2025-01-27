package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_B, D]
case class CC_C[E](a: T_A[T_B, E], b: (T_B,T_A[T_B, Boolean]), c: CC_B[T_B]) extends T_A[T_B, E]

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_))) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _, _))) => 2 
  case CC_A(_, CC_B(_)) => 3 
  case CC_A(_, CC_C(CC_A(_, _), (_,_), CC_B(_))) => 4 
  case CC_A(_, CC_C(CC_B(_), (_,_), CC_B(_))) => 5 
  case CC_A(_, CC_C(CC_C(_, _, _), (_,_), CC_B(_))) => 6 
  case CC_B(_) => 7 
  case CC_C(_, _, CC_B(CC_A(_, _))) => 8 
  case CC_C(_, _, CC_B(CC_B(_))) => 9 
  case CC_C(_, _, CC_B(CC_C(_, _, _))) => 10 
}
}