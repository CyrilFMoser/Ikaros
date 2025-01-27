package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: T_B[E, E], c: T_A[E, Char]) extends T_A[E, Char]
case class CC_B(a: (T_A[Int, Int],Char), b: T_A[Int, Char], c: CC_A[Char]) extends T_A[T_A[T_A[(Char,Boolean), Char], T_A[Int, Int]], Char]
case class CC_C[F]() extends T_A[F, Char]

val v_a: T_A[T_A[T_A[(Char,Boolean), Char], T_A[Int, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(12, _, CC_A(_, _, _)) => 0 
  case CC_A(12, _, CC_B(_, _, _)) => 1 
  case CC_A(12, _, CC_C()) => 2 
  case CC_A(_, _, CC_A(_, _, _)) => 3 
  case CC_A(_, _, CC_B(_, _, _)) => 4 
  case CC_A(_, _, CC_C()) => 5 
  case CC_B((_,_), CC_A(_, _, _), CC_A(_, _, CC_A(_, _, _))) => 6 
  case CC_B((_,_), CC_C(), CC_A(_, _, CC_A(_, _, _))) => 7 
  case CC_B((_,_), CC_A(_, _, _), CC_A(_, _, CC_C())) => 8 
  case CC_B((_,_), CC_C(), CC_A(_, _, CC_C())) => 9 
  case CC_C() => 10 
}
}