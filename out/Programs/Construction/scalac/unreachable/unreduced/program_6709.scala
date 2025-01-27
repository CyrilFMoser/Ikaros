package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_A[Byte, Char], T_A[(Int,Boolean), (Byte,Byte)]], T_A[T_A[Char, Boolean], T_A[Char, (Char,Int)]]]
case class CC_B[F, E](a: T_B[F, E], b: T_A[E, E], c: E) extends T_B[F, E]
case class CC_C[G, H](a: (CC_A,T_B[CC_A, CC_A]), b: T_B[G, G]) extends T_B[G, H]
case class CC_D[I](a: I) extends T_B[I, T_B[Byte, T_B[(Boolean,Char), CC_A]]]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C(_, _) => 1 
}
}