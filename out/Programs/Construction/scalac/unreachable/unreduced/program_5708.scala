package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_B[Byte, Char]], b: T_A[(Boolean,Byte)], c: T_B[T_B[(Int,Boolean), Boolean], T_A[Byte]]) extends T_A[(T_A[Int],Char)]
case class CC_B[D](a: CC_A, b: T_A[D]) extends T_A[(T_A[Int],Char)]
case class CC_C[E, F](a: CC_B[T_A[F]], b: Char, c: T_B[F, F]) extends T_B[E, F]
case class CC_D[G, H](a: T_B[G, (CC_A,CC_A)], b: T_B[T_A[G], G]) extends T_B[G, H]
case class CC_E[I](a: CC_D[I, I], b: CC_C[I, I], c: CC_D[T_B[I, I], Byte]) extends T_B[I, T_B[I, I]]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), _, _) => 0 
  case CC_D(CC_C(_, _, _), CC_D(_, _)) => 1 
  case CC_D(CC_D(CC_C(_, _, _), _), CC_C(_, _, _)) => 2 
  case CC_D(CC_D(CC_C(_, _, _), _), CC_D(_, _)) => 3 
  case CC_D(CC_D(CC_D(_, _), _), CC_C(_, _, _)) => 4 
  case CC_D(CC_D(CC_D(_, _), _), CC_D(_, _)) => 5 
}
}
// This is not matched: CC_D(CC_C(_, _, _), CC_C(_, _, _))