package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Char,Boolean)]]
case class CC_B(a: CC_A) extends T_A[T_A[(Char,Boolean)]]
case class CC_C(a: T_A[T_A[CC_B]], b: (CC_A,T_A[Byte])) extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_, (CC_A(),_)) => 1 
}
}
// This is not matched: CC_A()