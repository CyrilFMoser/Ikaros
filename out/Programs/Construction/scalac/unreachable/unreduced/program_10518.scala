package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[T_B[E, E], T_A[E, E]], c: T_B[E, E]) extends T_A[E, T_A[Char, T_A[Byte, Byte]]]
case class CC_B[F](a: T_B[F, F]) extends T_A[F, T_A[Char, T_A[Byte, Byte]]]
case class CC_C(a: Boolean, b: T_A[(Byte,Int), Int], c: Boolean) extends T_A[Int, T_A[Char, T_A[Byte, Byte]]]

val v_a: T_A[Int, T_A[Char, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}