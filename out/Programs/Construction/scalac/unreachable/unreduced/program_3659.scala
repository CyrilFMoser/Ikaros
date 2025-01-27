package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Int) extends T_A[D, T_A[T_B[Int], T_A[Int, Char]]]
case class CC_B[E](a: E, b: T_A[E, E], c: Char) extends T_A[E, T_A[T_B[Int], T_A[Int, Char]]]
case class CC_C[F](a: CC_B[F], b: (Byte,Byte)) extends T_A[F, T_A[T_B[Int], T_A[Int, Char]]]
case class CC_D[G]() extends T_B[G]
case class CC_E[H](a: Boolean, b: CC_D[H]) extends T_B[H]
case class CC_F[I](a: Boolean, b: I) extends T_B[I]

val v_a: T_A[Boolean, T_A[T_B[Int], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_C(CC_B(_, _, _), (_,_)) => 2 
}
}
// This is not matched: CC_B(_, _, _)