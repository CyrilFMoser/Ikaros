package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[(Boolean,Byte)], b: T_B[T_A[Boolean], T_B[Boolean, Int]], c: T_B[T_A[Char], Boolean]) extends T_A[T_A[T_B[(Int,Int), Char]]]
case class CC_B() extends T_A[T_A[T_B[(Int,Int), Char]]]
case class CC_C[D, E](a: Int, b: CC_B) extends T_B[T_B[D, D], D]
case class CC_D[F](a: T_A[F], b: CC_C[F, F], c: CC_B) extends T_B[T_B[F, F], F]
case class CC_E[G](a: Int) extends T_B[T_B[G, G], G]

val v_a: T_A[T_A[T_B[(Int,Int), Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}