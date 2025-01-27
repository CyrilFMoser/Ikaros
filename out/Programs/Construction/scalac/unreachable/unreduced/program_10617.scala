package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char) extends T_A[(T_A[Byte],T_A[Byte])]
case class CC_B[E, D](a: T_A[D], b: CC_A) extends T_B[E, D]
case class CC_C[G, F]() extends T_B[F, G]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_C() => 1 
}
}