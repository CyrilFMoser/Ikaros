package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, E], b: ((Char,Boolean),((Boolean,Boolean),Int)), c: CC_A[E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, CC_A(_, _, _)) => 0 
  case CC_A(_, 0, CC_B(_)) => 1 
  case CC_A(_, 0, CC_C(_, _, _)) => 2 
  case CC_A(_, _, CC_A(_, _, _)) => 3 
  case CC_A(_, _, CC_B(_)) => 4 
  case CC_A(_, _, CC_C(_, _, _)) => 5 
  case CC_B(_) => 6 
  case CC_C(_, _, _) => 7 
}
}