package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: (Boolean,Boolean), c: T_B[E, E]) extends T_A[T_A[T_A[(Int,Char), Int], T_B[Char, Int]], E]
case class CC_B() extends T_A[T_A[T_A[(Int,Char), Int], T_B[Char, Int]], CC_A[T_B[Int, Boolean]]]
case class CC_C[F](a: F, b: T_A[F, F], c: Int) extends T_B[F, T_A[F, F]]

val v_a: T_A[T_A[T_A[(Int,Char), Int], T_B[Char, Int]], CC_A[T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (true,_), _) => 0 
  case CC_A(_, (false,_), _) => 1 
  case CC_B() => 2 
}
}