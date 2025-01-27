package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[T_B[T_B[Boolean]], D]
case class CC_B[E](a: E, b: T_B[E]) extends T_A[T_B[T_B[Boolean]], E]
case class CC_C[F]() extends T_A[T_B[T_B[Boolean]], T_A[CC_A[Boolean], (Byte,Byte)]]

val v_a: T_A[T_B[T_B[Boolean]], T_A[CC_A[Boolean], (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()