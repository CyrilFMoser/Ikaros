package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[H, G](a: ((Byte,Byte),T_B[Char, Boolean])) extends T_A[G, H]
case class CC_C(a: Boolean, b: CC_B[Boolean, T_B[Boolean, Boolean]], c: CC_A[Boolean, CC_A[Byte, Int]]) extends T_A[CC_B[Byte, T_B[Byte, Char]], Boolean]
case class CC_D[I](a: CC_A[I, I]) extends T_B[I, Int]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(((_,_),_)) => 1 
}
}