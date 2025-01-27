package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int) extends T_A[(Char,T_A[Int])]
case class CC_B(a: T_A[T_B[(Char,Boolean), (Int,Boolean)]], b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[(Char,T_A[Int])]
case class CC_C[D](a: D, b: T_A[D], c: CC_A) extends T_A[D]
case class CC_D[E](a: CC_C[E], b: E, c: CC_A) extends T_B[E, (T_B[CC_B, (Char,Int)],CC_C[CC_A])]
case class CC_E[F](a: T_B[F, F], b: CC_D[F]) extends T_B[F, (T_B[CC_B, (Char,Int)],CC_C[CC_A])]

val v_a: T_B[Int, (T_B[CC_B, (Char,Int)],CC_C[CC_A])] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(12, _, _), _, CC_A(12)) => 0 
  case CC_D(CC_C(_, _, _), _, CC_A(12)) => 1 
  case CC_D(CC_C(12, _, _), _, CC_A(_)) => 2 
  case CC_D(CC_C(_, _, _), _, CC_A(_)) => 3 
  case CC_E(_, _) => 4 
}
}