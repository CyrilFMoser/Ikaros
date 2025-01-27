package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_A[Int, Int], T_A[Int, Char]], E]
case class CC_B[F](a: F, b: T_B[F, F], c: F) extends T_B[F, Byte]
case class CC_C(a: CC_A[T_B[Boolean, Byte]]) extends T_B[T_B[CC_B[Boolean], T_B[Boolean, Int]], Byte]

val v_a: T_B[T_B[T_B[CC_B[Boolean], T_B[Boolean, Int]], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C(_)) => 0 
}
}
// This is not matched: CC_B(_, _)