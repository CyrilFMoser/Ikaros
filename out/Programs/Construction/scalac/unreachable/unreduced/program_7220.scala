package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[T_A[E, E], E]
case class CC_B[F, G](a: T_A[T_A[F, F], F]) extends T_B[G, F]
case class CC_C[H](a: T_B[H, H]) extends T_B[H, CC_A[H]]
case class CC_D(a: CC_B[CC_B[Byte, Boolean], CC_A[(Char,Char)]], b: T_B[Int, (Byte,(Char,Int))], c: T_A[CC_B[Char, Boolean], Char]) extends T_B[T_A[T_A[(Char,Byte), (Char,Byte)], (Char,Byte)], CC_A[T_A[T_A[(Char,Byte), (Char,Byte)], (Char,Byte)]]]

val v_a: T_B[T_A[T_A[(Char,Byte), (Char,Byte)], (Char,Byte)], CC_A[T_A[T_A[(Char,Byte), (Char,Byte)], (Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_)) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)