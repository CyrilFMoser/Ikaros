package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Boolean,Boolean)]]
case class CC_B(a: Int, b: T_A[Byte]) extends T_A[T_A[(Boolean,Boolean)]]

val v_a: T_A[T_A[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(12, _) => 1 
  case CC_B(_, _) => 2 
}
}