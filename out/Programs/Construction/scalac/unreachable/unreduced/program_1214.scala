package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_A[T_A[(Byte,Byte)]]]
case class CC_B(a: T_A[CC_A]) extends T_B
case class CC_C[B]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}