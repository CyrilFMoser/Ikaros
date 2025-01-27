package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B[D]() extends T_A[D, T_A[T_B, T_A[T_B, T_B]]]
case class CC_C[E](a: CC_A[E], b: (CC_A[T_B],Boolean)) extends T_A[E, T_A[T_B, T_A[T_B, T_B]]]
case class CC_D(a: T_A[CC_B[T_B], Boolean]) extends T_B
case class CC_E(a: CC_C[T_A[Byte, CC_D]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_) => 1 
}
}