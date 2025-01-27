package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_B, T_A[T_B, (Byte,Int)]], b: T_A[T_B, CC_C], c: CC_A[CC_A[CC_C]]) extends T_B
case class CC_E[E]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_), CC_A(_), CC_A(_)) => 1 
  case CC_D(CC_A(_), CC_B(), CC_A(_)) => 2 
  case CC_D(CC_B(), CC_A(_), CC_A(_)) => 3 
  case CC_D(CC_B(), CC_B(), CC_A(_)) => 4 
  case CC_E() => 5 
}
}