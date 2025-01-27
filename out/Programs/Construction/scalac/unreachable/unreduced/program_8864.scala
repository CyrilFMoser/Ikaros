package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Boolean,Byte)]]
case class CC_B(a: Int) extends T_A[T_A[(Boolean,Byte)]]
case class CC_C(a: Byte, b: CC_B, c: T_A[CC_A]) extends T_A[T_A[(Boolean,Byte)]]

val v_a: T_A[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}