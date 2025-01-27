package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Char, Boolean], T_A[Char, Int]]]
case class CC_B[D](a: D, b: T_A[D, D], c: CC_A[D]) extends T_A[D, T_A[T_A[Char, Boolean], T_A[Char, Int]]]
case class CC_C(a: T_A[T_A[Char, Boolean], T_A[Int, Int]]) extends T_A[CC_A[CC_B[Byte]], T_A[T_A[Char, Boolean], T_A[Char, Int]]]

val v_a: T_A[Int, T_A[T_A[Char, Boolean], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(12, _, CC_A()) => 1 
  case CC_B(_, _, CC_A()) => 2 
}
}