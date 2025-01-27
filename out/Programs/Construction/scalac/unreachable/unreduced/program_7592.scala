package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[(Boolean,Boolean)]]
case class CC_B(a: Byte, b: T_A[CC_A[Boolean]], c: CC_A[CC_A[Byte]]) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_C() extends T_A[T_A[(Boolean,Boolean)]]

val v_a: T_A[T_A[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(0, _, CC_A()) => 1 
  case CC_B(_, _, CC_A()) => 2 
}
}
// This is not matched: CC_C()