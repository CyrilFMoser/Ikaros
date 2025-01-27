package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, Char]) extends T_A[C, Byte]
case class CC_B[D](a: CC_A[D], b: (T_A[Boolean, Byte],CC_A[Byte]), c: D) extends T_A[D, Byte]
case class CC_C[E](a: E, b: E, c: T_A[E, Byte]) extends T_A[E, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C('x', _, CC_A(_, _)) => 2 
  case CC_C(_, _, CC_A(_, _)) => 3 
  case CC_C('x', _, CC_B(_, _, _)) => 4 
  case CC_C(_, _, CC_B(_, _, _)) => 5 
  case CC_C('x', _, CC_C(_, _, CC_A(_, _))) => 6 
  case CC_C(_, _, CC_C(_, _, CC_A(_, _))) => 7 
  case CC_C('x', _, CC_C(_, _, CC_B(_, _, _))) => 8 
  case CC_C(_, _, CC_C(_, _, CC_B(_, _, _))) => 9 
  case CC_C('x', _, CC_C(_, _, CC_C(_, _, _))) => 10 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 11 
}
}