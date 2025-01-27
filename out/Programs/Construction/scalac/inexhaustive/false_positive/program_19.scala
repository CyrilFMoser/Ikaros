package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
}
}
// This is not matched: CC_C(CC_D(CC_A(), CC_A(), CC_C(_)))