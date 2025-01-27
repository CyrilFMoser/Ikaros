package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, Char]]) extends T_A[C, T_A[T_A[Char, (Boolean,Int)], Int]]
case class CC_B[D](a: Char, b: Char) extends T_A[D, T_A[T_A[Char, (Boolean,Int)], Int]]
case class CC_C[E](a: CC_B[E], b: Byte, c: CC_B[E]) extends T_A[E, T_A[T_A[Char, (Boolean,Int)], Int]]

val v_a: T_A[Int, T_A[T_A[Char, (Boolean,Int)], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}