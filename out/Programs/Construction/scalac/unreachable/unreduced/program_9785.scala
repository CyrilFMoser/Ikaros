package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[T_B, C]
case class CC_B[D](a: Boolean, b: T_A[D, D]) extends T_A[T_B, D]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_B(true, _) => 1 
  case CC_B(false, _) => 2 
}
}
// This is not matched: CC_A(_, CC_D())