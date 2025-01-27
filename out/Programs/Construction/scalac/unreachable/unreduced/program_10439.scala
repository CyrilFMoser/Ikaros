package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[T_A[(T_B,Int), C], C]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: CC_A[CC_B], b: T_A[CC_B, T_B]) extends T_B
case class CC_D(a: CC_B, b: Char, c: T_B) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _))) => 1 
  case CC_B(CC_B(CC_D(_, _, _))) => 2 
  case CC_B(CC_C(_, _)) => 3 
  case CC_B(CC_D(_, _, CC_B(_))) => 4 
  case CC_B(CC_D(_, _, CC_C(_, _))) => 5 
  case CC_B(CC_D(_, _, CC_D(_, _, _))) => 6 
}
}