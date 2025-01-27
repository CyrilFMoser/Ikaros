package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, Boolean]) extends T_A[F, Boolean]
case class CC_C[G](a: Char) extends T_B[G, CC_A[T_A[(Byte,Int), Boolean]]]
case class CC_D[H](a: H, b: CC_A[H]) extends T_B[H, CC_A[T_A[(Byte,Int), Boolean]]]

val v_a: T_B[Char, CC_A[T_A[(Byte,Int), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_A(_)) => 1 
}
}