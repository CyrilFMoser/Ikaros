package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B(a: CC_A, b: T_A[T_A[Char]], c: T_A[T_A[CC_A]]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(CC_A(CC_A(_)), _, _) => 2 
  case CC_B(CC_A(CC_B(_, _, _)), _, _) => 3 
}
}