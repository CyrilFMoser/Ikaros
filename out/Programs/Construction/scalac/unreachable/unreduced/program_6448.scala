package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Int]]) extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_B() extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_C[D](a: D, b: CC_A, c: T_A[D]) extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_D[F, E](a: CC_A, b: T_B[E, E]) extends T_B[E, F]
case class CC_E[H, G]() extends T_B[H, G]

val v_a: T_B[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), CC_D(CC_A(_), CC_D(_, _))) => 0 
  case CC_D(CC_A(_), CC_D(CC_A(_), CC_E())) => 1 
  case CC_D(CC_A(_), CC_E()) => 2 
  case CC_E() => 3 
}
}