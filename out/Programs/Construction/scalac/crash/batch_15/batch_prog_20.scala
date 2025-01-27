package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: (T_B,(T_B,T_B))) extends T_A[T_A[T_B]]
case class CC_B[B]() extends T_A[B]
case class CC_C(a: Byte, b: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)