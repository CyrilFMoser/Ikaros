package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: Boolean, c: (T_B,T_B)) extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,CC_D())) => 0 
}
}
// This is not matched: (CC_B Byte Boolean (T_B (CC_A Boolean Boolean) Byte))