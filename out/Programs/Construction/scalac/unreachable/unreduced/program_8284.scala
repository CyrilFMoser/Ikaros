package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean) extends T_A[T_A[T_A[(Byte,Char)]]]
case class CC_B(a: T_A[T_A[T_B]]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_) => 2 
}
}