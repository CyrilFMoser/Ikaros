package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: ((Char,Byte),Byte), b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[CC_A], b: T_A[T_A[CC_A]], c: T_B[T_B[(Char,Char), Int], ((Int,Char),Int)]) extends T_A[T_A[Int]]
case class CC_C(a: (CC_B,CC_A), b: T_B[(CC_A,CC_B), T_A[Boolean]]) extends T_A[T_A[Int]]
case class CC_D[D](a: CC_B, b: T_B[T_A[CC_B], D], c: T_A[D]) extends T_B[T_A[CC_B], D]
case class CC_E[E](a: T_B[T_B[E, E], E], b: CC_A) extends T_B[T_A[CC_B], E]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _)