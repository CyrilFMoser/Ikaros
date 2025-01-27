package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C]) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_B Int Wildcard (T_A Int))