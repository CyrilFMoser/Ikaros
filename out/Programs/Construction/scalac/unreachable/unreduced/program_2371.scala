package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[Char, Byte], T_B[Boolean, Char]]) extends T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Boolean), Char]], T_B[Char, T_B[Byte, Int]]]
case class CC_B[E](a: E) extends T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Boolean), Char]], T_B[Char, T_B[Byte, Int]]]
case class CC_C(a: CC_B[Byte]) extends T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Boolean), Char]], T_B[Char, T_B[Byte, Int]]]

val v_a: CC_B[T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Boolean), Char]], T_B[Char, T_B[Byte, Int]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C(CC_B(_))) => 2 
}
}