package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[(Byte,Boolean), T_A[Char, Boolean]], b: Int) extends T_A[Int, (Int,Char)]
case class CC_B[E](a: (T_A[CC_A, CC_A],CC_A), b: E, c: T_A[E, E]) extends T_A[Int, (Int,Char)]
case class CC_C[F](a: Byte, b: Boolean, c: ((Char,CC_A),T_B[CC_A, (Byte,Char)])) extends T_A[Int, (Int,Char)]
case class CC_D[G, H](a: T_A[H, G], b: H, c: T_A[Int, (Int,Char)]) extends T_B[G, H]
case class CC_E[J, I](a: (CC_B[CC_A],Byte), b: T_B[I, J]) extends T_B[I, J]

val v_a: T_A[Int, (Int,Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, ((_,_),CC_D(_, _, _))) => 2 
  case CC_C(_, _, ((_,_),CC_E(_, _))) => 3 
}
}