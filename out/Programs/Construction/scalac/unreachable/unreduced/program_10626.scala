package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Char,Char)]]]
case class CC_B(a: (CC_A,T_A[CC_A]), b: CC_A) extends T_A[T_A[T_A[(Char,Char)]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[(Char,Char)]]]

val v_a: T_A[T_A[T_A[(Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),_), CC_A()) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()