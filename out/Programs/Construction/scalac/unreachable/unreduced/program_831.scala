package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte) extends T_A[T_A[Char]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[Char]]
case class CC_C() extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()