package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Byte], b: C) extends T_A[C, Byte]
case class CC_B() extends T_B
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: T_A[T_B, Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_B()