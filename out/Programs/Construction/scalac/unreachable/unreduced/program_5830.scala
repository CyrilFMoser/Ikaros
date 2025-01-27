package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: ((Char,Byte),T_B[Char, Int])) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: Char, c: F) extends T_A[F]
case class CC_D[G](a: CC_A[G], b: T_A[G]) extends T_B[G, T_A[T_A[Int]]]
case class CC_E[H]() extends T_B[H, T_A[T_A[Int]]]
case class CC_F[I](a: T_B[I, T_A[I]], b: T_A[I]) extends T_B[I, T_A[I]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_)) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(_, _, _)) => 3 
  case CC_C(_, _, 0) => 4 
  case CC_C(_, _, _) => 5 
}
}