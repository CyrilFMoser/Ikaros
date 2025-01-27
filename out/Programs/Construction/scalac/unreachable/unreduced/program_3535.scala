package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, F]) extends T_A[E, F]
case class CC_B[H, G](a: (T_B[Char, Boolean],(Byte,Boolean))) extends T_A[G, H]
case class CC_C[I](a: I, b: T_B[I, I]) extends T_B[T_B[((Int,Boolean),Char), T_A[Int, Char]], I]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B((_,_))) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A(CC_A(_))