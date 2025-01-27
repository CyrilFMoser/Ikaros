package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Int, c: T_B[D]) extends T_A[T_B[T_A[Int, Int]], D]
case class CC_B(a: T_B[T_A[Boolean, Boolean]]) extends T_A[T_B[T_A[Int, Int]], CC_A[T_A[Boolean, (Boolean,Char)]]]
case class CC_C(a: T_B[CC_B], b: CC_B) extends T_A[T_B[T_A[Int, Int]], CC_A[T_A[Boolean, (Boolean,Char)]]]
case class CC_D[E](a: CC_A[E]) extends T_B[E]
case class CC_E[F]() extends T_B[F]
case class CC_F[G](a: G, b: Byte, c: Int) extends T_B[G]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D(CC_A(_, _, _))) => 0 
  case CC_B(CC_E()) => 1 
  case CC_B(CC_F(_, _, 12)) => 2 
  case CC_B(CC_F(_, _, _)) => 3 
}
}