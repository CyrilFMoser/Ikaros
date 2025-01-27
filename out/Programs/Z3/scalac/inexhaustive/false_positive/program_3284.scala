package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, (Byte,Char)], C]
case class CC_B() extends T_B
case class CC_C(a: T_B, b: T_A[Byte, Int], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_B()) => 1 
}
}
// This is not matched: (CC_C (CC_C (CC_B T_B) Wildcard Wildcard T_B) Wildcard Wildcard T_B)