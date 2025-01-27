package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[((Int,Boolean),Byte)], b: T_B[D], c: T_B[D]) extends T_A[D, T_B[(Int,Boolean)]]
case class CC_B[E]() extends T_A[E, T_B[(Int,Boolean)]]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: G) extends T_B[G]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(_)) => 0 
}
}
// This is not matched: CC_A(_, _, CC_C())