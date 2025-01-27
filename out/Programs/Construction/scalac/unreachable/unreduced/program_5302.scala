package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[(T_B,T_B), T_B], C]
case class CC_B(a: CC_A[CC_A[Char]], b: T_A[T_B, CC_A[Byte]], c: Boolean) extends T_B
case class CC_C[D]() extends T_B
case class CC_D(a: CC_C[Int], b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _, true) => 0 
  case CC_B(CC_A(_), _, false) => 1 
  case CC_C() => 2 
  case CC_D(CC_C(), CC_C()) => 3 
  case CC_D(CC_C(), CC_D(CC_C(), CC_B(_, _, _))) => 4 
  case CC_D(CC_C(), CC_D(CC_C(), CC_C())) => 5 
  case CC_D(CC_C(), CC_D(CC_C(), CC_D(_, _))) => 6 
}
}
// This is not matched: CC_D(CC_C(), CC_B(CC_A(_), _, _))