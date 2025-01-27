package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, E]]) extends T_A[E, T_B[Char, T_B[Int, Boolean]]]
case class CC_B[F](a: ((Boolean,(Int,Char)),CC_A[Boolean]), b: (T_A[Byte, (Int,Char)],T_A[Int, Byte])) extends T_A[F, T_B[Char, T_B[Int, Boolean]]]
case class CC_C[G](a: CC_B[(Int,Char)]) extends T_A[G, T_B[Char, T_B[Int, Boolean]]]
case class CC_D[I, H]() extends T_B[I, H]

val v_a: T_A[Byte, T_B[Char, T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_)) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)