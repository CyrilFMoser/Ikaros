package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E) extends T_A[F, E]
case class CC_B[H, G](a: T_A[G, G], b: T_A[H, T_B[H, H]]) extends T_A[H, G]
case class CC_C[I](a: (CC_A[(Char,Int), Boolean],CC_B[Char, Int])) extends T_B[T_A[I, T_B[Char, I]], I]
case class CC_D(a: T_A[(Boolean,Int), CC_C[Byte]], b: T_A[Boolean, T_B[Byte, Boolean]], c: T_B[CC_A[(Char,Byte), (Int,Int)], T_A[(Boolean,Char), Boolean]]) extends T_B[T_A[Byte, T_B[Char, Byte]], Byte]

val v_a: T_B[T_A[Byte, T_B[Char, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_),CC_B(_, _))) => 0 
  case CC_D(_, CC_A(_), _) => 1 
  case CC_D(_, CC_B(_, _), _) => 2 
}
}