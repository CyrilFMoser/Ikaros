package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[Boolean, C]) extends T_A[Boolean, C]
case class CC_B(a: T_A[Boolean, CC_A[T_B]]) extends T_A[Boolean, T_A[Boolean, T_A[T_B, T_B]]]
case class CC_C[D](a: CC_B, b: Int) extends T_A[Boolean, D]

val v_a: T_A[Boolean, T_A[Boolean, T_A[Boolean, T_A[T_B, T_B]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_B(CC_C(_, _)), _) => 1 
}
}
// This is not matched: CC_C(CC_B(CC_A(_, _, _)), _)