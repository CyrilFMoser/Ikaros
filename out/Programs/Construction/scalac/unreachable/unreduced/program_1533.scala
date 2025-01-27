package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int, b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: (T_A[Boolean],(Int,Byte)), c: T_A[E]) extends T_A[E]
case class CC_C(a: Byte, b: T_A[(Char,Int)]) extends T_A[T_A[T_A[Int]]]
case class CC_D(a: T_A[(CC_C,CC_C)], b: T_A[(CC_C,CC_C)], c: CC_B[CC_A[CC_C]]) extends T_B[CC_A[Boolean], Char]
case class CC_E[F](a: CC_C, b: Char, c: T_B[CC_A[Boolean], Char]) extends T_B[F, T_A[F]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), (_,_), _) => 1 
  case CC_B(CC_B(_, _, _), (_,_), _) => 2 
}
}