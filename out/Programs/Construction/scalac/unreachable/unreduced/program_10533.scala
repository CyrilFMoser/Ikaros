package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[T_A[Byte]]) extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_B(a: Byte, b: Int, c: CC_A) extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_C[B]() extends T_A[(T_A[Boolean],T_A[Boolean])]

val v_a: T_A[(T_A[Boolean],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(true, _)) => 0 
  case CC_B(_, _, CC_A(false, _)) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_A(_, _)