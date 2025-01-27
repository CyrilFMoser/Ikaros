package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: C, c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: (T_A[Char, Char],CC_A[Char, Int])) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_A(_, 12, CC_B((_,_))) => 2 
  case CC_A(_, _, CC_B((_,_))) => 3 
  case CC_B((_,CC_A(_, _, _))) => 4 
}
}