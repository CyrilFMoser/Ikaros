package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Int, Char],T_A[Boolean])) extends T_A[(T_B[Byte, Byte],T_A[Char])]
case class CC_D[D, E]() extends T_B[D, E]
case class CC_E[F, G]() extends T_B[F, G]

val v_a: T_A[(T_B[Byte, Byte],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A((CC_E(),_)) => 0 
}
}
// This is not matched: CC_B()