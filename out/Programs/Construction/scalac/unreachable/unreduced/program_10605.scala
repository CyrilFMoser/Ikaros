package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Int], Char]]
case class CC_B[D](a: T_A[T_A[D, D], D], b: T_A[T_A[Int, D], D], c: T_A[D, D]) extends T_A[D, T_A[T_A[Byte, Int], Char]]
case class CC_C[E](a: CC_B[E], b: CC_B[E], c: CC_A[E]) extends T_A[E, T_A[T_A[Byte, Int], Char]]

val v_a: T_A[Int, T_A[T_A[Byte, Int], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_B(_, _, _), _, _) => 2 
}
}