package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D) extends T_A[D, T_A[D, D]]
case class CC_C(a: (Byte,CC_B[Byte]), b: Char, c: T_A[T_A[Int, Byte], T_A[T_A[Int, Byte], T_A[Int, Byte]]]) extends T_A[Char, T_A[Char, Char]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_)) => 1 
  case CC_A(_, _, CC_C(_, _, _)) => 2 
  case CC_B(_) => 3 
  case CC_C(_, _, CC_A(_, _, CC_A(_, _, _))) => 4 
  case CC_C(_, _, CC_A(_, _, CC_B(_))) => 5 
  case CC_C(_, _, CC_B(_)) => 6 
}
}