package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: Char) extends T_A[D, Byte]
case class CC_B[E](a: T_A[E, T_A[E, E]], b: Int) extends T_A[E, Byte]
case class CC_C[F](a: CC_A[F]) extends T_A[F, Byte]
case class CC_D[G](a: T_B[G], b: T_A[G, Byte], c: T_A[G, Byte]) extends T_B[G]
case class CC_E(a: CC_A[T_A[Byte, Byte]], b: Char) extends T_B[T_A[CC_D[(Int,Char)], Byte]]
case class CC_F() extends T_B[T_A[CC_D[(Int,Char)], Byte]]

val v_a: T_A[T_B[T_A[CC_D[(Int,Char)], Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _)) => 2 
}
}