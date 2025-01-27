package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, F], b: (T_B[Byte, Int],T_B[Char, Int])) extends T_A[E, F]
case class CC_B[H, G]() extends T_A[G, H]
case class CC_C[I](a: T_A[I, I], b: T_A[I, (Byte,Char)]) extends T_B[I, T_B[I, I]]
case class CC_D[J]() extends T_B[J, T_B[J, J]]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}