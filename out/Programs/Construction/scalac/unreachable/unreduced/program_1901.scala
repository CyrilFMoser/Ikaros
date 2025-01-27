package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Char) extends T_A[D, E]
case class CC_B[F, G](a: T_B[F], b: Byte, c: G) extends T_A[F, G]
case class CC_C(a: T_A[CC_B[(Char,Byte), Char], T_A[(Boolean,Byte), Char]], b: T_A[T_A[Boolean, Char], Char], c: T_B[CC_B[Byte, (Char,Int)]]) extends T_B[CC_A[Char, T_A[Boolean, Char]]]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}