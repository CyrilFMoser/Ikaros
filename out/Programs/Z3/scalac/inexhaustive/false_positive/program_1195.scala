package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: F) extends T_A[T_A[F, F], F]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A T_A)