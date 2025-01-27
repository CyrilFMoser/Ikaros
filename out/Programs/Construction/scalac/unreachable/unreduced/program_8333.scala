package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Char, c: T_A[B]) extends T_A[Char]
case class CC_B(a: Int, b: T_A[CC_A[Char]], c: T_A[Char]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_B(_, _, CC_B(_, _, CC_A(_, _, _))) => 2 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 3 
}
}