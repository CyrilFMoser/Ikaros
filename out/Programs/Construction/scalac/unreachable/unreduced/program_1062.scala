package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[Char]
case class CC_B(a: T_A[Char]) extends T_A[Char]
case class CC_C(a: T_A[CC_A], b: CC_B, c: T_A[T_A[Char]]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(_, _, _)) => 3 
  case CC_C(_, _, _) => 4 
}
}