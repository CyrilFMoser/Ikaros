package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Char]], C]
case class CC_B[D](a: CC_A[D], b: Byte, c: CC_A[D]) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Char]], D]
case class CC_C[E](a: E, b: (CC_A[Boolean],CC_B[Boolean]), c: CC_A[E]) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Char]], E]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Char, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(12, (CC_A(_, _),CC_B(_, _, _)), CC_A(_, _)) => 2 
}
}
// This is not matched: CC_C(_, (CC_A(_, _),CC_B(_, _, _)), CC_A(_, _))