package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: Byte, b: T_A[D, D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: CC_C()