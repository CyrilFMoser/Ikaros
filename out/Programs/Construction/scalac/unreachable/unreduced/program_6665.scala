package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[C, T_A[T_A[Byte, Boolean], T_A[Char, (Byte,Char)]]]
case class CC_B[D](a: CC_A[D], b: CC_A[T_A[D, D]], c: CC_A[CC_A[D]]) extends T_A[D, T_A[T_A[Byte, Boolean], T_A[Char, (Byte,Char)]]]
case class CC_C[E](a: Int, b: T_A[E, E]) extends T_A[E, T_A[T_A[Byte, Boolean], T_A[Char, (Byte,Char)]]]

val v_a: T_A[Byte, T_A[T_A[Byte, Boolean], T_A[Char, (Byte,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}