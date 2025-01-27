package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Byte, Boolean], T_A[Boolean, Char]]) extends T_A[T_B[T_B[Boolean, Byte], T_B[Int, Char]], T_A[T_A[Boolean, Boolean], T_B[Char, (Int,Char)]]]
case class CC_B(a: ((CC_A,CC_A),CC_A), b: Boolean, c: Byte) extends T_A[T_B[T_B[Boolean, Byte], T_B[Int, Char]], T_A[T_A[Boolean, Boolean], T_B[Char, (Int,Char)]]]
case class CC_C(a: CC_A, b: T_B[(Char,Char), CC_B]) extends T_A[T_B[T_B[Boolean, Byte], T_B[Int, Char]], T_A[T_A[Boolean, Boolean], T_B[Char, (Int,Char)]]]
case class CC_D[E]() extends T_B[CC_B, E]
case class CC_E[F]() extends T_B[CC_B, F]

val v_a: T_A[T_B[T_B[Boolean, Byte], T_B[Int, Char]], T_A[T_A[Boolean, Boolean], T_B[Char, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_), _) => 2 
}
}