package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B(a: CC_A[Int], b: T_A[T_A[T_B, T_B], T_B], c: CC_A[T_B]) extends T_B
case class CC_C(a: T_A[T_A[Int, T_B], T_A[T_B, T_B]]) extends T_B
case class CC_D(a: Boolean, b: CC_B, c: CC_A[Char]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), _), CC_A(_, CC_A(_, _))) => 0 
  case CC_C(_) => 1 
  case CC_D(_, CC_B(_, _, _), CC_A(_, _)) => 2 
}
}