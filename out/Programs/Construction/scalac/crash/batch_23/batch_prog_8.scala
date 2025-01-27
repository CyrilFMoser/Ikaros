package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, (T_B[Int, Boolean],(Boolean,Boolean))]
case class CC_B[F, G](a: T_B[G, G], b: CC_A[F]) extends T_A[F, (T_B[Int, Boolean],(Boolean,Boolean))]
case class CC_C[H](a: T_B[H, H]) extends T_A[H, (T_B[Int, Boolean],(Boolean,Boolean))]
case class CC_D[J, I, K](a: CC_A[K], b: Byte, c: T_B[K, K]) extends T_B[J, I]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}