package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[(Int,T_B), T_B], b: T_B) extends T_A[Char, T_B]
case class CC_B(a: T_B) extends T_A[Char, T_B]
case class CC_C(a: T_A[T_B, T_A[CC_B, CC_A]]) extends T_B
case class CC_D[C](a: CC_C, b: C) extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_C(_)) => 1 
  case CC_B(CC_D(_, _)) => 2 
}
}