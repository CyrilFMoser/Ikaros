package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, F]) extends T_A[F, E]
case class CC_B() extends T_B[T_B[T_A[Byte, Byte], T_A[Byte, Int]], T_B[T_A[Boolean, Char], Char]]
case class CC_C(a: T_A[Boolean, CC_A[CC_B, CC_B]], b: T_A[T_A[CC_B, CC_B], Int], c: CC_B) extends T_B[T_B[T_A[Byte, Byte], T_A[Byte, Int]], T_B[T_A[Boolean, Char], Char]]

val v_a: T_B[T_B[T_A[Byte, Byte], T_A[Byte, Int]], T_B[T_A[Boolean, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_), CC_A(_), CC_B()) => 1 
}
}