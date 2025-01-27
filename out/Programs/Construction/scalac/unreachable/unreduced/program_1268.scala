package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[T_B[E, F], F], b: T_B[E, E], c: Byte) extends T_A[E, F]
case class CC_B[G, H](a: Char, b: (Char,T_B[Boolean, Int]), c: T_A[G, G]) extends T_A[H, G]
case class CC_C[J, I]() extends T_A[I, J]
case class CC_D[K](a: T_A[K, CC_A[K, K]], b: K, c: CC_A[K, T_B[K, K]]) extends T_B[CC_B[T_A[(Boolean,Byte), Char], T_A[Boolean, Int]], K]
case class CC_E(a: CC_C[T_A[(Char,Byte), Int], CC_D[Byte]], b: CC_C[T_B[Boolean, Boolean], (Byte,Byte)], c: T_A[((Boolean,Char),Char), CC_A[Byte, Int]]) extends T_B[CC_B[T_A[(Boolean,Byte), Char], T_A[Boolean, Int]], Char]
case class CC_F[L](a: CC_C[L, CC_D[L]], b: L, c: Int) extends T_B[CC_B[T_A[(Boolean,Byte), Char], T_A[Boolean, Int]], L]

val v_a: T_A[T_B[CC_B[T_A[(Boolean,Byte), Char], T_A[Boolean, Int]], Char], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _, _)) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_B(_, _, CC_C()) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_A(_, _, _)