package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Char, Boolean], T_A[Int, Int]]]
case class CC_B[D](a: CC_A[D], b: T_A[CC_A[Int], D]) extends T_A[D, T_A[T_A[Char, Boolean], T_A[Int, Int]]]
case class CC_C[E](a: T_A[E, T_A[E, E]]) extends T_A[CC_A[Char], E]

val v_a: T_A[Byte, T_A[T_A[Char, Boolean], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}