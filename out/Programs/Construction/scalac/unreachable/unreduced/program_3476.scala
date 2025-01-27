package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean) extends T_A[E, (T_A[Char, (Int,Int)],Char)]
case class CC_B[F](a: CC_A[F], b: T_B[F, F], c: T_A[F, F]) extends T_A[F, (T_A[Char, (Int,Int)],Char)]
case class CC_C[H, G](a: T_A[H, H]) extends T_B[H, G]

val v_a: T_A[Byte, (T_A[Char, (Int,Int)],Char)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}