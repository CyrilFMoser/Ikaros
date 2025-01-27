package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_A[T_B],T_B)]
case class CC_B(a: CC_A, b: Boolean) extends T_A[(T_A[T_B],T_B)]
case class CC_C(a: Boolean, b: T_A[CC_B]) extends T_A[(T_A[T_B],T_B)]
case class CC_D(a: T_A[((Boolean,Int),CC_B)]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[(T_A[T_B],T_B)] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()