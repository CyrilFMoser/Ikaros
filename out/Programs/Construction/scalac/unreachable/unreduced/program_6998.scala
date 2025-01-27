package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[(Int,Boolean)], T_A[Boolean]]) extends T_A[T_B[T_B[Byte, Char], T_A[Char]]]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[T_B[T_B[Byte, Char], T_A[Char]]]
case class CC_C(a: T_B[(CC_A,CC_A), CC_B]) extends T_A[T_B[T_B[Byte, Char], T_A[Char]]]
case class CC_D[D, E]() extends T_B[D, E]
case class CC_E[F, G](a: T_A[F], b: CC_B, c: CC_D[G, F]) extends T_B[F, G]
case class CC_F[H]() extends T_B[T_B[Int, T_B[CC_A, (Boolean,Int)]], H]

val v_a: T_A[T_B[T_B[Byte, Char], T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_A(CC_E(_, _, _)) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_D()) => 3 
  case CC_C(CC_E(_, CC_B(_), CC_D())) => 4 
}
}