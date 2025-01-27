package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Char], T_A[Byte, Char]], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: (CC_A[Int],CC_A[Char])) extends T_A[T_A[T_A[Int, Char], T_A[Byte, Char]], D]
case class CC_C[E](a: E, b: E, c: CC_B[E]) extends T_A[E, (T_A[Boolean, Int],CC_A[Int])]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Byte, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, (CC_A(),CC_A())) => 1 
}
}