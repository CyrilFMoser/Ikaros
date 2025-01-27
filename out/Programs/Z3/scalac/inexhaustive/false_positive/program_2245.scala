package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_B[F](a: T_B[F, F], b: F) extends T_B[T_A[Byte], F]

val v_a: T_B[T_A[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: (CC_A Char (T_A Char))