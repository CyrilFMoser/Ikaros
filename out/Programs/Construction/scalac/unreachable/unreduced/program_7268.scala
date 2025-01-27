package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_B[T_A[(Int,Int)], Int], c: (T_B[Int, (Char,Byte)],(Char,Char))) extends T_A[Boolean]
case class CC_B(a: T_B[T_A[Boolean], CC_A]) extends T_A[Boolean]
case class CC_C(a: T_A[Boolean], b: Int, c: CC_B) extends T_A[Boolean]
case class CC_D[D, E]() extends T_B[D, E]
case class CC_E[F, G]() extends T_B[F, G]
case class CC_F[H](a: Int) extends T_B[H, T_B[H, H]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_D(),(_,_))) => 0 
  case CC_A(_, _, (CC_E(),(_,_))) => 1 
  case CC_B(CC_D()) => 2 
  case CC_B(CC_E()) => 3 
  case CC_C(_, _, CC_B(CC_D())) => 4 
  case CC_C(_, _, CC_B(CC_E())) => 5 
}
}