package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[(Boolean,Int), (Int,Byte)],T_A[(Int,Boolean)]), b: D) extends T_A[D]
case class CC_B[E](a: Char) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[F]) extends T_B[F, Char]
case class CC_D[G](a: Byte, b: G) extends T_B[G, Char]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_) => 1 
}
}