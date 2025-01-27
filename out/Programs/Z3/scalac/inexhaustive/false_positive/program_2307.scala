package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C]) extends T_A[T_A[Int, (Boolean,Boolean)], C]

val v_a: T_A[T_A[Int, (Boolean,Boolean)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_E Byte Wildcard Byte (T_B Byte (T_A (CC_D Boolean Boolean Boolean))))