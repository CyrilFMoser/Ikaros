package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: F, b: T_A[F], c: Byte) extends T_A[F]
case class CC_D[G](a: G, b: G) extends T_B[Byte, G]
case class CC_E() extends T_B[Byte, T_B[T_A[(Char,Byte)], T_B[Byte, Boolean]]]
case class CC_F(a: T_A[T_A[CC_E]], b: Int) extends T_B[T_A[CC_A[CC_E]], Char]

val v_a: T_B[Byte, T_B[T_A[(Char,Byte)], T_B[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E() => 1 
}
}