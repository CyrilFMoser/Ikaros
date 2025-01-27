package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_D() extends T_B

val v_a: T_A[T_B, CC_D] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), _) => 1 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Int Boolean) Byte))