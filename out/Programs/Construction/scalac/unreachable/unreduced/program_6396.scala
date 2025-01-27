package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B() extends T_A[T_A[T_B, (T_B,T_B)], T_B]
case class CC_C(a: T_A[T_A[T_B, T_B], T_B], b: T_A[CC_B, Byte]) extends T_A[T_A[T_B, (T_B,T_B)], T_B]
case class CC_D(a: T_A[CC_A[CC_C], T_B], b: CC_B) extends T_B
case class CC_E(a: Byte, b: T_A[CC_D, Boolean], c: Byte) extends T_B

val v_a: T_A[T_A[T_B, (T_B,T_B)], T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A(), _) => 1 
}
}
// This is not matched: CC_B()