package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Byte]], b: T_B[T_A[Char], T_B[Byte, Int]], c: T_A[Char]) extends T_A[T_B[Char, ((Byte,Boolean),Boolean)]]
case class CC_B[D](a: D, b: Byte) extends T_B[D, (((Char,Int),CC_A),CC_A)]
case class CC_C[F, E](a: E, b: F, c: Int) extends T_B[E, F]
case class CC_D[G](a: G, b: CC_B[G], c: T_B[G, G]) extends T_B[G, (((Char,Int),CC_A),CC_A)]

val v_a: T_B[Int, (((Char,Int),CC_A),CC_A)] = null
val v_b: Int = v_a match{
  case CC_C(_, ((_,_),CC_A(_, _, _)), _) => 0 
  case CC_D(_, CC_B(_, 0), _) => 1 
  case CC_D(_, CC_B(_, _), _) => 2 
}
}
// This is not matched: CC_B(_, _)