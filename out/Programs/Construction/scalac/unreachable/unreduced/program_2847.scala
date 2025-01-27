package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_B, c: T_B) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_A[T_B, T_B], D]
case class CC_C[E](a: T_A[T_B, E]) extends T_A[T_A[T_B, T_B], E]
case class CC_D(a: T_A[T_A[T_B, T_B], T_A[T_B, T_B]], b: Char) extends T_B
case class CC_E(a: CC_A[Byte], b: CC_A[T_A[T_B, T_B]], c: CC_A[T_B]) extends T_B
case class CC_F(a: T_A[T_B, CC_A[Byte]], b: T_A[CC_B[T_B], CC_B[T_B]]) extends T_B

val v_a: T_A[T_A[T_B, T_B], CC_F] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, CC_D(_, _), CC_D(_, _))) => 1 
  case CC_C(CC_A(_, CC_E(_, _, _), CC_D(_, _))) => 2 
  case CC_C(CC_A(_, CC_F(_, _), CC_D(_, _))) => 3 
  case CC_C(CC_A(_, CC_D(_, _), CC_E(_, _, _))) => 4 
  case CC_C(CC_A(_, CC_F(_, _), CC_E(_, _, _))) => 5 
  case CC_C(CC_A(_, CC_D(_, _), CC_F(_, _))) => 6 
  case CC_C(CC_A(_, CC_E(_, _, _), CC_F(_, _))) => 7 
  case CC_C(CC_A(_, CC_F(_, _), CC_F(_, _))) => 8 
}
}
// This is not matched: CC_C(CC_A(_, CC_E(_, _, _), CC_E(_, _, _)))