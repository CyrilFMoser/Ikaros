package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: (T_A[Byte, Int],T_B[Int]), c: T_B[D]) extends T_A[D, T_A[T_A[Boolean, Boolean], T_A[Char, Byte]]]
case class CC_B[E](a: E, b: Boolean) extends T_A[E, T_A[T_A[Boolean, Boolean], T_A[Char, Byte]]]
case class CC_C[F](a: CC_A[CC_B[F]]) extends T_A[F, (T_B[Char],CC_B[Int])]
case class CC_D[G](a: T_B[G], b: Char, c: CC_C[G]) extends T_B[G]
case class CC_E[H]() extends T_B[T_A[Boolean, CC_A[Char]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Boolean], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), CC_D(_, _, _)) => 0 
  case CC_B(_, _) => 1 
}
}