package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, E], b: E) extends T_A[F, E]
case class CC_B(a: T_A[T_A[Int, Char], T_A[Int, Byte]], b: Int) extends T_A[Char, (T_A[Int, Int],CC_A[Byte, Char])]
case class CC_C[G](a: G, b: T_B[G, T_A[G, G]], c: CC_A[G, G]) extends T_A[Char, (T_A[Int, Int],CC_A[Byte, Char])]
case class CC_D(a: T_B[CC_A[CC_B, CC_B], T_A[CC_B, (Byte,Byte)]], b: T_A[((Boolean,Boolean),CC_B), CC_C[CC_B]], c: T_B[CC_A[CC_B, CC_B], T_A[CC_B, CC_B]]) extends T_B[Char, T_B[CC_A[Boolean, (Char,Int)], T_B[CC_B, CC_B]]]

val v_a: T_A[Char, (T_A[Int, Int],CC_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _)