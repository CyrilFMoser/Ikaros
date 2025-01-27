package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, Boolean], b: T_A[Byte, Boolean]) extends T_A[Byte, Boolean]
case class CC_B(a: T_A[T_A[Byte, Int], T_A[CC_A, CC_A]]) extends T_A[Byte, Boolean]
case class CC_C[C]() extends T_A[Byte, Boolean]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
  case CC_A(_, CC_C()) => 2 
}
}