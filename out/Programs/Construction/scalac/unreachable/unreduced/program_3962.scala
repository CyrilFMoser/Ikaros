package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[Boolean, E]) extends T_A[Boolean, E]
case class CC_B(a: Int, b: T_A[T_B[Char, (Int,Byte)], Int]) extends T_B[T_B[T_A[Byte, Int], T_B[Byte, Int]], Boolean]
case class CC_C(a: T_A[Boolean, T_A[Byte, CC_B]], b: CC_A[CC_A[CC_B]]) extends T_B[T_B[T_A[Byte, Int], T_B[Byte, Int]], Boolean]

val v_a: T_B[T_B[T_A[Byte, Int], T_B[Byte, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_A(CC_A(_, _), CC_A(_, _))) => 1 
}
}