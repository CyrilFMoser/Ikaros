package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: Char) extends T_A[D]
case class CC_B[E](a: T_A[E], b: Int) extends T_A[E]
case class CC_C[F](a: T_B[F, F], b: T_A[F], c: Int) extends T_B[F, CC_B[(Char,Boolean)]]
case class CC_D[G]() extends T_B[G, CC_B[(Char,Boolean)]]

val v_a: T_B[Boolean, CC_B[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
}
}