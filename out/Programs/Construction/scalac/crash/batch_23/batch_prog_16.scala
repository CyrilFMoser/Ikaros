package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B[B](a: Byte, b: B, c: (CC_A,T_A)) extends T_A
case class CC_C[C]() extends T_B[C]
case class CC_D(a: (T_B[T_A],T_A)) extends T_B[(T_B[CC_A],Byte)]
case class CC_E() extends T_B[(T_B[CC_A],Byte)]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}