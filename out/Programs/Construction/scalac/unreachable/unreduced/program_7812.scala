package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Boolean,Boolean)]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_C(a: Byte, b: (CC_A,T_A[CC_A])) extends T_A[T_A[(Boolean,Boolean)]]

val v_a: T_A[T_A[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_C(0, (CC_A(),_)) => 1 
  case CC_C(_, (CC_A(),_)) => 2 
}
}
// This is not matched: CC_A()