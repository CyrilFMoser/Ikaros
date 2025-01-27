package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: T_B[T_A[Char]], c: T_B[T_B[(Int,Char)]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B[C](a: T_A[T_A[C]]) extends T_B[C]
case class CC_C[D]() extends T_B[D]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), CC_B(_), CC_B(_)) => 0 
  case CC_A(CC_B(_), CC_B(_), CC_C()) => 1 
  case CC_A(CC_C(), CC_B(_), CC_B(_)) => 2 
  case CC_A(CC_C(), CC_B(_), CC_C()) => 3 
  case CC_A(CC_B(_), CC_C(), CC_B(_)) => 4 
  case CC_A(CC_B(_), CC_C(), CC_C()) => 5 
  case CC_A(CC_C(), CC_C(), CC_B(_)) => 6 
  case CC_A(CC_C(), CC_C(), CC_C()) => 7 
}
}