package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[T_A[(Char,Char)]], c: D) extends T_A[D]
case class CC_B[F](a: T_A[F], b: F) extends T_A[F]
case class CC_C[G](a: CC_A[G], b: G) extends T_A[G]
case class CC_D[H](a: T_A[H]) extends T_B[H, T_A[CC_A[Byte]]]
case class CC_E[I](a: T_B[I, I]) extends T_B[I, T_A[CC_A[Byte]]]
case class CC_F(a: T_A[T_A[Boolean]], b: CC_C[CC_C[Int]], c: CC_A[CC_B[Int]]) extends T_B[CC_B[CC_C[Int]], T_A[CC_A[Byte]]]

val v_a: T_B[Boolean, T_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_D(CC_B(_, true)) => 1 
  case CC_D(CC_B(_, false)) => 2 
  case CC_D(CC_C(_, _)) => 3 
  case CC_E(_) => 4 
}
}