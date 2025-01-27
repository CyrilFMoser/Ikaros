package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Int, b: Byte) extends T_A[T_B[D], D]
case class CC_B[F](a: ((Byte,Int),T_A[Boolean, Int]), b: T_A[T_B[F], F]) extends T_A[T_B[F], F]
case class CC_C[G](a: (T_B[Int],CC_B[Char]), b: Byte, c: G) extends T_B[G]
case class CC_D[H](a: (T_A[Byte, Char],T_A[Int, Int]), b: T_B[H]) extends T_B[H]
case class CC_E(a: CC_B[CC_A[Boolean, Int]], b: T_A[T_B[T_B[Boolean]], T_B[Boolean]], c: CC_A[Byte, CC_D[Byte]]) extends T_B[T_A[Int, T_B[Char]]]

val v_a: T_A[T_B[Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_), CC_A(_, _)) => 1 
  case CC_B((_,_), CC_B(_, _)) => 2 
}
}