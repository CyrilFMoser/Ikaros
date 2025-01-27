package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: Char, c: T_A[E, E]) extends T_A[D, E]
case class CC_B[F, G](a: T_A[F, G]) extends T_A[F, G]
case class CC_C[H](a: T_A[H, H], b: CC_B[H, (Boolean,Int)]) extends T_A[H, CC_A[Int, T_B[Byte]]]
case class CC_D(a: T_A[CC_C[Boolean], CC_C[(Boolean,Byte)]], b: T_A[(Char,Int), Byte]) extends T_B[CC_C[T_A[Char, Boolean]]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}