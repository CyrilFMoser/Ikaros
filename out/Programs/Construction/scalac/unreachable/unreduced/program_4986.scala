package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_A[Byte]), b: (Boolean,T_B)) extends T_A[T_A[(T_B,T_B)]]
case class CC_B() extends T_A[T_A[(T_B,T_B)]]
case class CC_C(a: T_A[T_B], b: CC_B) extends T_A[T_A[(T_B,T_B)]]
case class CC_D(a: Char, b: CC_B, c: Byte) extends T_B
case class CC_E(a: T_B, b: CC_D, c: T_A[CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(), _) => 0 
  case CC_E(_, _, _) => 1 
}
}