package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, (T_A[Int, Char],T_A[Byte, (Int,Char)])]
case class CC_B[F](a: Boolean) extends T_B[F, CC_A[T_B[Byte, Byte]]]
case class CC_C[G, H](a: T_A[Byte, G], b: T_A[G, H], c: H) extends T_B[H, G]

val v_a: T_B[Int, CC_A[T_B[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(true) => 0 
  case CC_B(false) => 1 
  case CC_C(_, _, _) => 2 
}
}