package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: (T_B,T_B)) extends T_A[Char]
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_E())) => 0 
}
}
// This is not matched: (CC_B (Tuple Byte T_B) T_B (T_A (Tuple Byte T_B)))