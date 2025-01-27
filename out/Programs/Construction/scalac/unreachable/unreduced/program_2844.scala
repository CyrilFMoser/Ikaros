package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,T_A[T_B])]
case class CC_B(a: T_A[T_B]) extends T_A[(T_B,T_A[T_B])]
case class CC_C(a: CC_B, b: T_B, c: CC_B) extends T_A[(T_B,T_A[T_B])]
case class CC_D(a: Boolean, b: Byte) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_A[(T_B,T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_D(_, _), _) => 2 
  case CC_C(_, CC_E(), _) => 3 
  case CC_C(_, CC_F(), _) => 4 
}
}