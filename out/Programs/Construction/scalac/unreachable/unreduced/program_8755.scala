package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_A[D], D], b: D) extends T_A[D]
case class CC_B[E](a: Byte) extends T_A[E]
case class CC_C() extends T_A[T_B[CC_B[Char], (Int,Int)]]
case class CC_D[F]() extends T_B[F, T_A[T_A[CC_C]]]
case class CC_E(a: CC_D[T_A[CC_C]], b: T_A[T_A[CC_C]], c: CC_A[T_A[CC_C]]) extends T_B[T_A[T_B[Int, CC_C]], T_A[T_A[CC_C]]]
case class CC_F(a: CC_D[CC_E], b: (T_A[CC_C],(CC_C,CC_E))) extends T_B[T_A[T_B[Int, CC_C]], T_A[T_A[CC_C]]]

val v_a: T_A[T_B[CC_B[Char], (Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()