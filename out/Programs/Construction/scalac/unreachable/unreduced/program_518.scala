package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[((Byte,Boolean),Boolean)]) extends T_A[(T_A[Byte],T_B[Boolean, Char])]
case class CC_B() extends T_A[(T_A[Byte],T_B[Boolean, Char])]
case class CC_C[D, E](a: T_B[E, CC_A], b: D, c: D) extends T_B[D, E]
case class CC_D[G, F](a: (T_A[CC_A],T_B[CC_B, CC_A])) extends T_B[F, G]

val v_a: T_A[(T_A[Byte],T_B[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}