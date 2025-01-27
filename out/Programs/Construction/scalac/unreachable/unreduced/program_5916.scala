package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Boolean,Int)]]
case class CC_B(a: T_A[(Boolean,CC_A)], b: Int) extends T_A[T_A[(Boolean,Int)]]
case class CC_C(a: Byte) extends T_A[T_A[(Boolean,Int)]]

val v_a: T_A[T_A[(Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}