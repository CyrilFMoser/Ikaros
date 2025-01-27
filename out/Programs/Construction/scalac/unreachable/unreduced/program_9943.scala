package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_B, c: (T_B,T_B)) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: Boolean, b: (T_B,(Char,T_B))) extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_B
case class CC_D() extends T_B
case class CC_E(a: (CC_B,T_A[CC_A]), b: (CC_A,CC_D)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E((CC_B(_, _),_), (CC_A(_, _, _),CC_D())) => 1 
}
}
// This is not matched: CC_C()