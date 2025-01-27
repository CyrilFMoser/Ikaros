package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B(a: T_A[T_A[T_B, Boolean], T_A[T_B, T_B]], b: T_A[T_B, T_A[T_B, T_B]]) extends T_A[T_B, Boolean]
case class CC_C(a: CC_B, b: T_B, c: CC_A[T_B]) extends T_B
case class CC_D(a: CC_C, b: CC_A[(CC_C,CC_B)], c: Int) extends T_B
case class CC_E(a: CC_C, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_A(_, _)), _, CC_A(CC_C(_, _, _), CC_A(_, _))) => 0 
  case CC_C(CC_B(_, CC_A(_, _)), _, CC_A(CC_D(_, _, _), CC_A(_, _))) => 1 
  case CC_D(CC_C(CC_B(_, _), _, _), CC_A(_, CC_A(_, _)), _) => 2 
  case CC_E(CC_C(_, _, _), _) => 3 
}
}
// This is not matched: CC_C(CC_B(_, CC_A(_, _)), _, CC_A(CC_E(_, _), CC_A(_, _)))