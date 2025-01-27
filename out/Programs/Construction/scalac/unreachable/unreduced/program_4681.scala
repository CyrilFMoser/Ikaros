package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (Int,T_A[Byte, Char])) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: Byte, b: Int, c: Boolean) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_)) => 1 
}
}
// This is not matched: CC_C(_, _, _)