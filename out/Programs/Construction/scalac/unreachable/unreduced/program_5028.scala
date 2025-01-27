package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: C) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: T_A[T_A[T_B, T_B], CC_B[T_B]], b: CC_B[T_B], c: CC_B[((Int,Char),T_B)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(_, _, _)) => 1 
  case CC_D(_, CC_B(), CC_B()) => 2 
}
}