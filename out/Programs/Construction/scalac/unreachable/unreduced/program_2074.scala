package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_A[(CC_A,CC_A)], b: CC_A, c: T_A[T_A[Boolean]]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(CC_B(_, _, _)), _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(CC_A(_)), _)