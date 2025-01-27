package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D, c: D) extends T_A[D, Byte]
case class CC_B[E](a: E) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D(a: Byte, b: CC_A[T_B[Int]], c: T_B[T_A[Char, Int]]) extends T_B[Byte]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(0, CC_A(_, CC_B(_), _), CC_B(_)) => 0 
  case CC_D(0, CC_A(_, CC_C(), _), CC_B(_)) => 1 
  case CC_D(_, CC_A(_, CC_B(_), _), CC_B(_)) => 2 
  case CC_D(_, CC_A(_, CC_C(), _), CC_B(_)) => 3 
  case CC_D(0, CC_A(_, CC_B(_), _), CC_C()) => 4 
  case CC_D(0, CC_A(_, CC_C(), _), CC_C()) => 5 
  case CC_D(_, CC_A(_, CC_B(_), _), CC_C()) => 6 
  case CC_D(_, CC_A(_, CC_C(), _), CC_C()) => 7 
}
}