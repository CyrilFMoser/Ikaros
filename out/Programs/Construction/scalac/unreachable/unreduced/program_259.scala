package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]], b: T_A[T_A[Int]], c: (T_B[(Char,Char)],T_B[Byte])) extends T_A[(T_A[Boolean],T_A[(Boolean,Byte)])]
case class CC_B(a: Char, b: T_A[(Boolean,CC_A)]) extends T_A[(T_A[Boolean],T_A[(Boolean,Byte)])]
case class CC_C() extends T_A[(T_A[Boolean],T_A[(Boolean,Byte)])]
case class CC_D(a: CC_A, b: T_B[(CC_B,CC_B)]) extends T_B[T_B[T_A[CC_C]]]

val v_a: T_A[(T_A[Boolean],T_A[(Boolean,Byte)])] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)