package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Char, Char], T_B[Char, Char]]) extends T_A[T_B[T_A[Int, Char], T_B[Int, Char]], T_A[T_A[Char, Boolean], T_A[Boolean, Byte]]]
case class CC_B(a: T_B[Char, CC_A], b: T_A[Byte, T_A[CC_A, CC_A]]) extends T_A[T_B[T_A[Int, Char], T_B[Int, Char]], T_A[T_A[Char, Boolean], T_A[Boolean, Byte]]]

val v_a: T_A[T_B[T_A[Int, Char], T_B[Int, Char]], T_A[T_A[Char, Boolean], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}