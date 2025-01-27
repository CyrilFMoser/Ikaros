package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[Char]]) extends T_A[Char]
case class CC_B(a: T_A[Char]) extends T_A[Char]
case class CC_C(a: CC_A) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A('x', _)) => 1 
  case CC_B(CC_A(_, _)) => 2 
  case CC_B(CC_B(_)) => 3 
  case CC_B(CC_C(CC_A(_, _))) => 4 
  case CC_C(CC_A('x', _)) => 5 
  case CC_C(CC_A(_, _)) => 6 
}
}