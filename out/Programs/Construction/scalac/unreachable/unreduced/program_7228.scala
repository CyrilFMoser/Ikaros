package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Byte,Int)], b: Byte) extends T_A[T_A[(Byte,Int)]]
case class CC_B(a: (T_A[CC_A],T_A[CC_A])) extends T_A[T_A[(Byte,Int)]]
case class CC_C() extends T_A[T_A[(Byte,Int)]]

val v_a: T_A[T_A[(Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)