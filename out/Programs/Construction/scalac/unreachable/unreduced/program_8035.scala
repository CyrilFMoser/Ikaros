package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_A[T_B]]) extends T_A[Char]
case class CC_B(a: (CC_A,CC_A)) extends T_A[Char]
case class CC_C(a: T_A[Char]) extends T_A[Char]
case class CC_D(a: CC_C) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _)) => 2 
  case CC_C(CC_B(_)) => 3 
  case CC_C(CC_C(CC_A(_, _))) => 4 
  case CC_C(CC_C(CC_C(_))) => 5 
}
}
// This is not matched: CC_C(CC_C(CC_B(_)))