package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_B[CC_A[Boolean], (Int,Int)], b: T_A[Int], c: T_B[(Boolean,Byte), T_A[Int]]) extends T_A[T_A[(Boolean,Byte)]]
case class CC_C() extends T_A[T_A[(Boolean,Byte)]]
case class CC_D[E]() extends T_B[E, CC_A[(Int,CC_C)]]
case class CC_E[F](a: Boolean, b: T_A[F]) extends T_B[F, CC_A[(Int,CC_C)]]
case class CC_F[G](a: CC_A[G], b: T_A[G]) extends T_B[G, CC_A[(Int,CC_C)]]

val v_a: T_A[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)