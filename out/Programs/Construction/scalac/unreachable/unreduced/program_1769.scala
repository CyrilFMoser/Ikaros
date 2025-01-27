package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: (T_B[Int, Boolean],T_B[Byte, Char])) extends T_A[D]
case class CC_B[F, G](a: (T_A[(Boolean,Char)],T_B[Boolean, Boolean])) extends T_A[F]
case class CC_C[H](a: CC_B[Boolean, H], b: (CC_A[(Byte,Int), Char],T_A[Int])) extends T_A[H]
case class CC_D[I](a: Int) extends T_B[I, T_B[I, I]]
case class CC_E[J](a: CC_B[J, J], b: Boolean, c: Byte) extends T_B[J, T_B[J, J]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B((_,_)) => 1 
  case CC_C(CC_B(_), (_,_)) => 2 
}
}