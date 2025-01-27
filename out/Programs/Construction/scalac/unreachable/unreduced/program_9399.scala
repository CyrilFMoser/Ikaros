package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A, c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_B[CC_B, C], b: T_B[C, C], c: CC_B) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)