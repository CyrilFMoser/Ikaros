package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[T_A[T_B[Char, (Boolean,Byte)]]]) extends T_A[D]
case class CC_B[F, G, H](a: Int, b: Char, c: T_B[G, G]) extends T_B[F, G]
case class CC_C[J, I](a: T_A[J]) extends T_B[I, J]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}
// This is not matched: CC_C(CC_A(CC_A(_)))