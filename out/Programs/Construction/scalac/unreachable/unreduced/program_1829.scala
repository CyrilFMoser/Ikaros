package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C() extends T_B
case class CC_D(a: T_A[(Int,T_B), CC_C], b: T_A[T_B, CC_B[T_B]], c: CC_A[CC_B[CC_C]]) extends T_B
case class CC_E(a: T_A[T_A[T_A[CC_D, CC_C], T_A[CC_D, CC_C]], T_A[CC_D, CC_C]], b: T_A[T_A[(T_B,CC_C), (T_B,CC_C)], (T_B,CC_C)]) extends T_B

val v_a: T_A[T_A[CC_D, CC_D], CC_D] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}