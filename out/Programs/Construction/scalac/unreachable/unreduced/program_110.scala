package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Int) extends T_A[D, T_B[T_A[D, D]]]
case class CC_B[E, F](a: Byte) extends T_A[E, F]
case class CC_C[G](a: T_A[G, G]) extends T_A[G, T_B[T_A[G, G]]]
case class CC_D[H](a: H) extends T_B[Int]

val v_a: T_A[Char, T_B[T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_)) => 2 
}
}