package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, T_B], b: T_B, c: D) extends T_A[D, T_B]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[(Char,Int), T_B], T_B], b: Boolean, c: CC_B[T_A[(Boolean,Int), (Boolean,Char)]]) extends T_B
case class CC_E(a: Byte, b: T_A[CC_B[T_B], T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_B(CC_A(), CC_C(), _)) => 1 
  case CC_D(_, _, CC_B(CC_B(_, _, _), CC_C(), _)) => 2 
  case CC_D(_, _, CC_B(CC_B(_, _, _), CC_D(_, _, _), _)) => 3 
  case CC_D(_, _, CC_B(CC_A(), CC_E(_, _), _)) => 4 
  case CC_D(_, _, CC_B(CC_B(_, _, _), CC_E(_, _), _)) => 5 
  case CC_E(_, CC_A()) => 6 
  case CC_E(_, CC_B(_, _, _)) => 7 
}
}
// This is not matched: CC_D(_, _, CC_B(CC_A(), CC_D(_, _, _), _))