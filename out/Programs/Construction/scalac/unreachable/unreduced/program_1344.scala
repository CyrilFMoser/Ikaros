package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C[E](a: T_A[T_A[(Byte,Int)]], b: (T_A[Boolean],Char), c: Byte) extends T_A[E]
case class CC_D(a: T_A[CC_A[Boolean]]) extends T_B[CC_A[T_A[Int]]]
case class CC_E[G](a: CC_A[G]) extends T_B[CC_A[T_A[Int]]]
case class CC_F(a: CC_E[Byte]) extends T_B[CC_A[T_A[Int]]]

val v_a: T_B[CC_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B(_)) => 1 
  case CC_D(CC_C(_, _, _)) => 2 
  case CC_E(_) => 3 
}
}
// This is not matched: CC_F(CC_E(_))