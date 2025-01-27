package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[Boolean, Byte], C]
case class CC_C[E](a: CC_A[E]) extends T_A[T_A[Boolean, (Boolean,Char)], E]

val v_a: T_A[T_A[Boolean, (Boolean,Char)], Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(12, _)) => 0 
}
}
// This is not matched: (CC_B Byte (T_A Byte))