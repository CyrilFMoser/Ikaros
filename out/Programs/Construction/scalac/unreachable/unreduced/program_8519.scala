package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: E) extends T_B[CC_A[Byte], E]
case class CC_C[F]() extends T_B[CC_A[Byte], F]
case class CC_D[G](a: (CC_B[Byte],T_B[(Byte,Char), Char]), b: T_A[G]) extends T_B[CC_A[Byte], G]

val v_a: T_B[CC_A[Byte], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D((CC_B(_),_), _) => 2 
}
}