package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Char), b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: (Char,T_A[Byte, Char])) extends T_A[Char, T_A[Char, Char]]
case class CC_C[D](a: Char) extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C('x') => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _)