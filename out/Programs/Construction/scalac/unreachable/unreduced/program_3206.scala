package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Char]) extends T_A[Boolean, Char]
case class CC_B(a: CC_A, b: T_A[Boolean, Char], c: T_A[Byte, T_A[Boolean, Char]]) extends T_A[Boolean, Char]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, CC_A(_), _)) => 2 
  case CC_A(CC_B(_, CC_B(_, _, _), _)) => 3 
  case CC_B(CC_A(CC_A(_)), CC_A(CC_A(_)), _) => 4 
  case CC_B(CC_A(CC_A(_)), CC_A(CC_B(_, _, _)), _) => 5 
  case CC_B(CC_A(CC_A(_)), CC_B(_, _, _), _) => 6 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_A(_)), _) => 7 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_B(_, _, _)), _) => 8 
  case CC_B(CC_A(CC_B(_, _, _)), CC_B(_, _, _), _) => 9 
}
}