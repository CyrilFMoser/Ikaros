package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Byte], b: T_A[T_A[Char]], c: T_A[T_A[Boolean]]) extends T_A[Byte]
case class CC_B[D]() extends T_A[Byte]
case class CC_C[E](a: T_A[E], b: E) extends T_B[(CC_B[CC_A],CC_B[(Byte,Int)]), E]
case class CC_D[F](a: CC_B[F], b: Byte, c: CC_C[F]) extends T_B[(CC_B[CC_A],CC_B[(Byte,Int)]), F]
case class CC_E[G, H](a: T_B[H, G]) extends T_B[(CC_B[CC_A],CC_B[(Byte,Int)]), G]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_B() => 2 
}
}