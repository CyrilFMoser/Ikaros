package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[((Byte,Int),Int)]]
case class CC_B(a: (Boolean,(CC_A,Int)), b: CC_A) extends T_A[T_A[((Byte,Int),Int)]]
case class CC_C(a: T_A[(CC_B,CC_B)], b: CC_B) extends T_A[T_A[((Byte,Int),Int)]]

val v_a: T_A[T_A[((Byte,Int),Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_C(_, _) => 2 
}
}