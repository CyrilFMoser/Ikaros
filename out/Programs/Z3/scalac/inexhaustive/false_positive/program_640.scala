package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_C[F](a: Int) extends T_A[F, T_A[F, F]]

val v_a: CC_C[T_B] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants