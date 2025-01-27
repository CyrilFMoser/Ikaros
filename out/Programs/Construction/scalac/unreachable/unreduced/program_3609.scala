package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: (T_A[Boolean, Char],(Byte,Char))) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: E, c: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,(_,_))) => 1 
  case CC_C(_, _, CC_A(_)) => 2 
  case CC_C(_, _, CC_C(_, _, CC_A(_))) => 3 
  case CC_C(_, _, CC_C(_, _, CC_B(_, _))) => 4 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 5 
}
}
// This is not matched: CC_C(_, _, CC_B(_, (_,_)))