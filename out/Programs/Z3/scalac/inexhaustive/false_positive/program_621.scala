package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: Char) extends T_A[T_A[Char, Byte], F]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B T_A)