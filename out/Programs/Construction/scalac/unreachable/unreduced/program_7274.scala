package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B, c: Boolean) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: Boolean, c: T_A[Char]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_D(CC_C(), _, _) => 1 
}
}
// This is not matched: CC_C()