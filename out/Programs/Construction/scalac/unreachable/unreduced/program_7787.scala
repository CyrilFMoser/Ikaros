package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Char, Byte], T_A[Char, Char]], C]
case class CC_B[D](a: (T_A[Boolean, Char],T_A[Char, Byte])) extends T_A[T_A[T_A[Char, Byte], T_A[Char, Char]], D]
case class CC_C[E](a: CC_A[E]) extends T_A[T_A[T_A[Char, Byte], T_A[Char, Char]], E]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Char, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B((_,_))