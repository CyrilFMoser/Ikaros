package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Boolean]], b: Byte, c: T_B[T_B[Char, Char], T_A[(Char,Byte)]]) extends T_A[(Byte,T_B[Int, (Boolean,Int)])]
case class CC_B(a: T_B[CC_A, CC_A], b: Int) extends T_A[(Byte,T_B[Int, (Boolean,Int)])]
case class CC_C(a: CC_A, b: CC_B, c: T_B[CC_A, Char]) extends T_A[(Byte,T_B[Int, (Boolean,Int)])]
case class CC_D[D, E]() extends T_B[D, E]
case class CC_E[F, G](a: G) extends T_B[G, F]
case class CC_F[I, H](a: CC_D[I, I], b: H, c: T_A[H]) extends T_B[I, H]

val v_a: T_B[CC_B, T_A[(Byte,T_B[Int, (Boolean,Int)])]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_F(CC_D(), CC_A(_, _, _), _) => 1 
  case CC_F(CC_D(), CC_B(_, _), _) => 2 
  case CC_F(CC_D(), CC_C(_, _, _), _) => 3 
}
}
// This is not matched: CC_E(CC_B(_, _))