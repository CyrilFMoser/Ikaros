package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_B, T_B], b: (T_B,T_B)) extends T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_E(),_)) => 1 
}
}
// This is not matched: (CC_B T_A)