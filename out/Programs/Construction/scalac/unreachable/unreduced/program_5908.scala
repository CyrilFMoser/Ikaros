package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[(Boolean,Int)]]
case class CC_B(a: CC_A[CC_A[Boolean]], b: (T_A[Boolean],CC_A[Byte]), c: CC_A[(Char,(Char,Byte))]) extends T_A[T_A[(Boolean,Int)]]
case class CC_C() extends T_A[T_A[(Boolean,Int)]]

val v_a: T_A[T_A[(Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,CC_A()), CC_A()) => 1 
  case CC_C() => 2 
}
}