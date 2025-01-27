package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Int]], C]
case class CC_B[D](a: T_A[D, CC_A[D]], b: T_A[D, D], c: CC_A[D]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Int]], D]
case class CC_C[E](a: E, b: E, c: Int) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Int]], E]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
  case CC_C(_, 12, _) => 2 
  case CC_C(_, _, _) => 3 
}
}