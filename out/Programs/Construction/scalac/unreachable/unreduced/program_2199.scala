package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Boolean,(Char,(Byte,Int)))) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: F, b: T_A[F, F]) extends T_A[F, T_B[F, F]]
case class CC_C[G, H](a: CC_A[G], b: T_A[G, T_B[G, G]], c: CC_A[H]) extends T_B[(T_A[Byte, Char],CC_B[Byte]), G]

val v_a: T_A[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_, _) => 1 
}
}