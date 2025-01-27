package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, T_A[C, C]], c: T_A[C, Char]) extends T_A[C, Char]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, Char]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(CC_A(_, _, _), _)) => 1 
  case CC_A(_, _, CC_B(CC_B(_, _), _)) => 2 
  case CC_B(_, CC_A(_, _, _)) => 3 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 5 
}
}