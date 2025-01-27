package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,T_A[Char])) extends T_A[(Boolean,Byte)]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[T_A[CC_A]]) extends T_A[T_A[CC_A]]
case class CC_C() extends T_A[(Boolean,Byte)]

val v_a: T_A[(Boolean,Byte)] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
  case CC_A((_,_)) => 1 
  case CC_C() => 2 
}
}