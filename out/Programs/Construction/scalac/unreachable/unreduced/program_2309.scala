package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Int],T_A[Byte, Boolean])) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Byte]], C]
case class CC_B[D](a: (CC_A[Boolean],Int), b: T_A[D, D]) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Byte]], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Byte]], E]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Char, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)