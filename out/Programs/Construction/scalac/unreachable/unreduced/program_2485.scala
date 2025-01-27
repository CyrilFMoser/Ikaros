package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[(Int,Boolean)],T_A[(Int,Byte)])) extends T_A[T_B[T_A[Char], Char]]
case class CC_B(a: T_A[T_A[CC_A]], b: Int, c: T_A[Char]) extends T_A[T_B[T_A[Char], Char]]
case class CC_C() extends T_A[T_B[T_A[Char], Char]]
case class CC_D[D, E](a: Char, b: E) extends T_B[E, D]
case class CC_E[F, G](a: CC_C, b: T_B[G, F]) extends T_B[G, F]

val v_a: T_A[T_B[T_A[Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}