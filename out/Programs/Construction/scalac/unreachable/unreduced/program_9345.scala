package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: T_B, c: T_A[T_A[T_B]]) extends T_A[Byte]
case class CC_B() extends T_B
case class CC_C(a: CC_A, b: T_A[Byte], c: T_A[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}