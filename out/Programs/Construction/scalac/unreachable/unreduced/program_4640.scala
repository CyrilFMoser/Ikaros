package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: Char) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Byte) extends T_B[CC_A[CC_A[Char]], CC_A[T_B[Boolean, Int]]]
case class CC_C[F, E](a: Boolean, b: T_A[F], c: Int) extends T_B[F, E]
case class CC_D(a: CC_A[T_B[CC_B, (Int,Char)]], b: CC_A[T_B[CC_B, Byte]]) extends T_B[CC_A[CC_A[Char]], CC_A[T_B[Boolean, Int]]]

val v_a: T_B[CC_A[CC_A[Char]], CC_A[T_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(_)