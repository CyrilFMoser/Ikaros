package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_A[Byte, Char], T_B[Boolean, Byte]], T_B[(Char,Char), T_A[(Byte,Byte), Int]]]
case class CC_B[F, G](a: T_B[G, G]) extends T_B[T_B[T_B[Char, Boolean], T_B[Char, (Char,Char)]], F]
case class CC_C[H](a: T_B[H, H]) extends T_B[T_B[T_B[Char, Boolean], T_B[Char, (Char,Char)]], H]
case class CC_D(a: CC_B[Char, T_A[Char, Boolean]], b: Int, c: Char) extends T_B[T_B[T_B[Char, Boolean], T_B[Char, (Char,Char)]], CC_C[((Byte,Char),Byte)]]

val v_a: T_B[T_B[T_B[Char, Boolean], T_B[Char, (Char,Char)]], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
}
}