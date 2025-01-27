package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_A]) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C(a: CC_A, b: Byte, c: CC_B) extends T_B[T_B[CC_A]]
case class CC_D() extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12) => 1 
}
}
// This is not matched: CC_B(_)