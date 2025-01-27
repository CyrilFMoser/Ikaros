package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Boolean,Boolean)]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_C(a: Byte, b: Int) extends T_A[T_A[(Boolean,Boolean)]]

val v_a: T_A[T_A[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, 12) => 2 
  case CC_C(_, _) => 3 
}
}