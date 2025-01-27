package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: Int, b: Char) extends T_A[E]
case class CC_D(a: CC_C[Int], b: T_A[CC_A[Byte]], c: T_A[CC_C[Char]]) extends T_B[T_A[T_A[Char]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B())) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C(_, _))) => 2 
  case CC_A(_, _, CC_C(_, _)) => 3 
  case CC_B() => 4 
  case CC_C(_, 'x') => 5 
  case CC_C(_, _) => 6 
}
}
// This is not matched: CC_A(_, _, CC_B())