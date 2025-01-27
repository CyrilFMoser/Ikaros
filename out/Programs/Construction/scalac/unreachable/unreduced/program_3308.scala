package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Byte) extends T_A[E, T_A[T_A[Int, Char], Byte]]
case class CC_B(a: Int, b: CC_A[((Int,Int),Int)], c: T_A[Char, CC_A[Char]]) extends T_A[T_B[T_B[Boolean, Int], T_A[Char, Byte]], T_A[T_A[Int, Char], Byte]]

val v_a: T_A[T_B[T_B[Boolean, Int], T_A[Char, Byte]], T_A[T_A[Int, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}