package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[Char, T_A[Char, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[Char, T_A[Char, Boolean]], D]
case class CC_C[E](a: (T_A[Boolean, Boolean],Int), b: CC_B[E]) extends T_A[T_A[Char, T_A[Char, Boolean]], E]

val v_a: T_A[T_A[Char, T_A[Char, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((_,_), CC_B()) => 2 
}
}