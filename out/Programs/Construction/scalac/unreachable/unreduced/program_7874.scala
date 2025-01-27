package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: Int, c: T_A[T_A[(Int,Char)]]) extends T_A[Char]
case class CC_B(a: T_B[Char]) extends T_A[Char]
case class CC_C[C](a: T_A[Char]) extends T_B[C]

val v_a: CC_C[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _, _), 12, _)) => 0 
  case CC_C(CC_A(CC_B(_), 12, _)) => 1 
  case CC_C(CC_A(CC_A(_, _, _), _, _)) => 2 
  case CC_C(CC_A(CC_B(_), _, _)) => 3 
  case CC_C(CC_B(CC_C(_))) => 4 
}
}