package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C(a: Char, b: T_A[CC_A[Byte]]) extends T_A[T_B[T_A[Char], T_A[Byte]]]
case class CC_D[F](a: (T_A[(Char,Char)],Byte)) extends T_B[CC_B[CC_C], F]
case class CC_E[G](a: T_B[G, G]) extends T_B[CC_B[CC_C], G]

val v_a: T_B[CC_B[CC_C], Byte] = null
val v_b: Int = v_a match{
  case CC_D((CC_A(_),_)) => 0 
  case CC_D((CC_B(_),_)) => 1 
  case CC_E(_) => 2 
}
}