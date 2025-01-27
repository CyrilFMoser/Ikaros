package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B[C, D]
case class CC_B[F](a: T_B[F, F], b: F) extends T_A[F]
case class CC_C[G]() extends T_B[Byte, G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants