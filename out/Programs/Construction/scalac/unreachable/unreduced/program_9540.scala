package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Byte])) extends T_A[(T_A[Byte],Char)]
case class CC_B(a: Boolean, b: T_A[(CC_A,CC_A)], c: T_A[CC_A]) extends T_A[(T_A[Byte],Char)]
case class CC_C() extends T_A[(T_A[Byte],Char)]

val v_a: T_A[(T_A[Byte],Char)] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}