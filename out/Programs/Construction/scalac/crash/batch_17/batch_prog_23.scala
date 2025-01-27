package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: C, b: T_A[C, D], c: T_A[C, C]) extends T_A[D, C]
case class CC_B[E](a: Char, b: T_A[T_B, E]) extends T_A[Boolean, E]
case class CC_C[F]() extends T_A[Boolean, F]
case class CC_D[G]() extends T_B

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_, _)), CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C()), CC_A(_, _, CC_A(_, _, _))) => 2 
  case CC_A(_, CC_A(_, CC_B(_, _), CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 3 
  case CC_A(_, CC_A(_, CC_B(_, _), CC_B(_, _)), CC_A(_, _, CC_A(_, _, _))) => 4 
  case CC_A(_, CC_A(_, CC_B(_, _), CC_C()), CC_A(_, _, CC_A(_, _, _))) => 5 
  case CC_A(_, CC_A(_, CC_C(), CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 6 
  case CC_A(_, CC_A(_, CC_C(), CC_B(_, _)), CC_A(_, _, CC_A(_, _, _))) => 7 
  case CC_A(_, CC_A(_, CC_C(), CC_C()), CC_A(_, _, CC_A(_, _, _))) => 8 
  case CC_B(_, _) => 9 
}
}
// This is not matched: CC_C()