package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: ((T_B,T_B),T_A[T_B]), b: (T_A[T_B],Int), c: T_A[Char]) extends T_A[T_B]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: T_A[T_A[CC_A]], b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, 0) => 1 
}
}
// This is not matched: CC_C(_, _)