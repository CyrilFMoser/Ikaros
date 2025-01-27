package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Byte]
case class CC_B[C](a: (T_B[CC_A],CC_A), b: T_A[Byte], c: T_B[C]) extends T_B[C]
case class CC_C(a: (T_A[Byte],CC_A)) extends T_B[T_B[CC_A]]
case class CC_D(a: T_A[(Char,CC_C)]) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(),CC_A())) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)