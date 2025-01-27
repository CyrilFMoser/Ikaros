package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Boolean) extends T_A[Char]
case class CC_B(a: T_A[Char]) extends T_A[Char]
case class CC_C(a: T_A[CC_B], b: T_B, c: T_A[CC_A]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_, _, _))) => 4 
  case CC_B(CC_C(_, _, _)) => 5 
  case CC_C(_, _, _) => 6 
}
}