package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[Char, Char]]) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Char]], T_A[T_A[Int, (Char,Byte)], T_A[(Char,Boolean), Boolean]]]
case class CC_B[C](a: C, b: C, c: Byte) extends T_A[C, CC_A]
case class CC_C[D](a: T_A[CC_B[D], D], b: CC_B[D], c: T_A[D, T_A[D, D]]) extends T_A[D, CC_A]

val v_a: T_A[Byte, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_B(_, _, _), _) => 1 
}
}