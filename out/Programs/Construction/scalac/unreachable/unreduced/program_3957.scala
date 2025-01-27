package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[(Byte,Boolean), Int],(Byte,Boolean)), c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: Boolean, c: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, CC_A(_, _, _)) => 2 
  case CC_C(_, _, CC_B(_)) => 3 
  case CC_C(_, _, CC_C(_, _, CC_A(_, _, _))) => 4 
  case CC_C(_, _, CC_C(_, _, CC_B(_))) => 5 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 6 
}
}