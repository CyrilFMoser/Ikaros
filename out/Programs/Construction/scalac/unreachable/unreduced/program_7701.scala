package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, T_A[Byte, F]], b: T_B[T_A[F, E], F], c: T_A[E, (Int,Byte)]) extends T_A[Byte, E]
case class CC_B[H, G](a: T_B[G, G], b: CC_A[G, H]) extends T_B[H, G]
case class CC_C[I](a: (CC_B[Boolean, Int],Byte)) extends T_B[I, T_B[I, I]]
case class CC_D[J](a: CC_A[J, J], b: CC_A[J, J], c: CC_B[T_B[J, J], J]) extends T_B[J, T_B[J, J]]

val v_a: T_B[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_C((CC_B(_, _),_)) => 1 
  case CC_D(CC_A(CC_B(_, _), CC_B(_, _), _), CC_A(CC_B(_, _), _, _), _) => 2 
}
}