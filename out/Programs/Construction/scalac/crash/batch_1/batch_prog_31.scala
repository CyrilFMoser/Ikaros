package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_A[E, D], c: Char) extends T_A[D, E]
case class CC_B[F](a: T_A[F, F], b: (CC_A[Char, (Int,Char)],T_B[Boolean])) extends T_A[F, Int]
case class CC_C[G](a: (T_B[Boolean],Byte)) extends T_A[Byte, G]
case class CC_D[H](a: CC_B[H], b: (Int,T_A[Char, Int]), c: H) extends T_B[H]
case class CC_E[I](a: T_A[I, Int], b: T_B[I]) extends T_B[I]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_A(_, _, _), _), _, _) => 0 
  case CC_E(_, CC_E(CC_A(_, _, _), CC_D(_, _, _))) => 1 
  case CC_E(_, CC_E(CC_A(_, _, _), CC_E(_, _))) => 2 
  case CC_E(_, CC_E(CC_B(_, _), CC_D(_, _, _))) => 3 
  case CC_E(_, CC_E(CC_B(_, _), CC_E(_, _))) => 4 
}
}
// This is not matched: CC_E(_, CC_D(CC_B(_, _), (_,_), _))