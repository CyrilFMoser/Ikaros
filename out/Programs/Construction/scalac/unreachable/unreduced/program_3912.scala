package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, Boolean], c: T_A[T_A[T_B[Byte, Boolean]]]) extends T_A[D]
case class CC_B[F](a: (T_A[Boolean],T_A[Int])) extends T_A[F]
case class CC_C[G](a: Byte, b: T_A[G]) extends T_B[G, T_A[T_A[Int]]]
case class CC_D[H](a: T_A[H], b: H, c: T_B[T_A[H], H]) extends T_B[H, T_A[T_A[Int]]]

val v_a: T_B[Char, T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_B((_,_)), _, _) => 1 
}
}
// This is not matched: CC_D(CC_A(_, _, _), _, _)