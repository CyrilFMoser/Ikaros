package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_B[D], b: T_A[D]) extends T_A[D]
case class CC_C[E](a: Byte, b: E, c: T_A[E]) extends T_A[E]
case class CC_D(a: CC_C[T_B[Byte]], b: T_B[Byte], c: CC_A[T_A[Char]]) extends T_B[T_B[CC_A[Boolean]]]
case class CC_E() extends T_B[T_B[CC_A[Boolean]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, CC_B(_, CC_A(_, _))) => 2 
  case CC_C(_, _, CC_B(_, CC_B(_, _))) => 3 
  case CC_C(_, _, CC_B(_, CC_C(_, _, _))) => 4 
  case CC_C(_, _, CC_C(_, _, CC_A(_, _))) => 5 
  case CC_C(_, _, CC_C(_, _, CC_B(_, _))) => 6 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 7 
}
}
// This is not matched: CC_C(_, _, CC_A(_, _))