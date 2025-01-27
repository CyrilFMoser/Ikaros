package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_B[Char, (Byte,Byte)]], b: T_B[T_B[Int, (Boolean,Byte)], T_B[Int, Char]]) extends T_A[(Int,T_A[(Boolean,Byte)])]
case class CC_B(a: CC_A) extends T_A[(Int,T_A[(Boolean,Byte)])]
case class CC_C(a: T_A[CC_B]) extends T_A[(Int,T_A[(Boolean,Byte)])]
case class CC_D[E, D]() extends T_B[D, E]
case class CC_E[G, F]() extends T_B[F, G]
case class CC_F[I, H]() extends T_B[I, H]

val v_a: T_A[(Int,T_A[(Boolean,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_D(), CC_D())) => 1 
  case CC_B(CC_A(CC_E(), CC_D())) => 2 
  case CC_B(CC_A(CC_F(), CC_D())) => 3 
  case CC_B(CC_A(CC_D(), CC_E())) => 4 
  case CC_B(CC_A(CC_F(), CC_E())) => 5 
  case CC_B(CC_A(CC_D(), CC_F())) => 6 
  case CC_B(CC_A(CC_E(), CC_F())) => 7 
  case CC_B(CC_A(CC_F(), CC_F())) => 8 
  case CC_C(_) => 9 
}
}
// This is not matched: CC_B(CC_A(CC_E(), CC_E()))