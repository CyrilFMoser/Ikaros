package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: Byte, b: T_A[CC_A], c: CC_A) extends T_A[T_B]
case class CC_C(a: Byte) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[Char], b: T_A[CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_C(_)