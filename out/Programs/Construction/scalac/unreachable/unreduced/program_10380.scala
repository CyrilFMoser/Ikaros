package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[Byte], D], b: T_A[D, D], c: T_A[T_B[Byte], T_A[T_A[Int, Int], T_A[Int, Int]]]) extends T_A[T_B[Byte], D]
case class CC_B() extends T_A[T_B[Byte], T_A[T_B[Byte], T_B[Boolean]]]
case class CC_C[F](a: Boolean, b: Char, c: (T_A[CC_B, CC_B],T_B[(Int,Int)])) extends T_A[T_B[Byte], F]
case class CC_D[G](a: Char, b: CC_B) extends T_B[G]
case class CC_E[H](a: T_A[H, H], b: H, c: CC_A[H]) extends T_B[H]

val v_a: T_A[T_B[Byte], T_A[T_B[Byte], T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}