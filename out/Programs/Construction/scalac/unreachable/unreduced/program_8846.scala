package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Byte, Boolean],T_A[Char, Char])) extends T_A[T_A[T_A[Byte, Int], Char], C]
case class CC_B[D](a: D, b: Int) extends T_A[T_A[T_A[Byte, Int], Char], D]
case class CC_C[E](a: E, b: CC_A[E]) extends T_A[E, CC_A[CC_A[Int]]]

val v_a: T_A[T_A[T_A[Byte, Int], Char], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _) => 1 
}
}