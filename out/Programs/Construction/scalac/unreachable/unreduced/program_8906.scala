package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: E) extends T_A[Char, E]
case class CC_B[G, F]() extends T_A[G, F]
case class CC_C[H](a: (T_B[Boolean, Byte],(Byte,Char))) extends T_A[Char, H]
case class CC_D[I](a: T_B[I, CC_B[I, I]]) extends T_B[I, CC_B[I, I]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C((_,(_,_))) => 2 
}
}