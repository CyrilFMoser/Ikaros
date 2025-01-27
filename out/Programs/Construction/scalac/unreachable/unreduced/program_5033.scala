package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[T_B[T_A[(Byte,Char), Int], T_A[Byte, Char]], E]
case class CC_B[F, G](a: Char, b: F) extends T_B[G, F]
case class CC_C[I, H](a: (T_A[Byte, Boolean],(Boolean,(Boolean,Int))), b: CC_B[I, H]) extends T_B[I, H]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, true) => 0 
  case CC_B(_, false) => 1 
  case CC_C((_,(_,_)), _) => 2 
}
}