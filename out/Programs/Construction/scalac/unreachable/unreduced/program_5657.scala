package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B(a: T_A[CC_A[T_B], T_A[(Int,Boolean), T_B]], b: Char) extends T_B
case class CC_C(a: T_B, b: Char) extends T_B

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), CC_A(CC_B(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_C(_, _), CC_A(CC_B(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_B(_, _), CC_A(CC_C(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_C(_, _), CC_A(CC_C(_, _), CC_A(_, _))) => 3 
}
}