package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Int], Byte]]
case class CC_B[D](a: T_A[D, D], b: Int) extends T_A[D, T_A[T_A[Char, Int], Byte]]
case class CC_C(a: CC_A[Char], b: CC_B[CC_A[Char]]) extends T_A[T_A[T_A[Char, Char], T_A[Int, Byte]], T_A[T_A[Char, Int], Byte]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Int, Byte]], T_A[T_A[Char, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}