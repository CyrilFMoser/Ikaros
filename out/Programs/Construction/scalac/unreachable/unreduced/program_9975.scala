package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_A[T_B, T_B], T_B], C]
case class CC_B[D](a: D, b: T_B, c: D) extends T_A[T_A[T_A[T_B, T_B], T_B], D]
case class CC_C[E]() extends T_A[T_A[T_A[T_B, T_B], T_B], Char]
case class CC_D(a: T_A[CC_C[Boolean], T_B], b: CC_A[(Char,T_B)], c: T_B) extends T_B
case class CC_E(a: CC_A[Int], b: CC_C[T_B], c: (((Char,Char),CC_D),T_B)) extends T_B
case class CC_F(a: CC_A[Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _, ((_,_),CC_D(_, _, _))) => 1 
  case CC_E(_, _, ((_,_),CC_E(_, _, _))) => 2 
  case CC_E(_, _, ((_,_),CC_F(_))) => 3 
}
}
// This is not matched: CC_F(CC_A())