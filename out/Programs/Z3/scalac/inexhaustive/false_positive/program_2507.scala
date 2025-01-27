package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[Boolean, C], C]

val v_a: T_A[T_A[Boolean, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_D (CC_A T_A T_A) Wildcard (T_B (CC_A T_A T_A)))