package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[(T_A[Boolean, T_B],T_A[T_B, T_B]), C]
case class CC_B[D](a: CC_A[D], b: T_A[D, T_A[D, D]], c: D) extends T_A[(T_A[Boolean, T_B],T_A[T_B, T_B]), D]
case class CC_C[E](a: E, b: CC_A[E]) extends T_A[(T_A[Boolean, T_B],T_A[T_B, T_B]), E]
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_B[Boolean], b: (CC_B[CC_D],((Byte,Boolean),CC_E))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_F(CC_B(CC_A(), _, _), (CC_B(_, _, _),(_,_))) => 2 
}
}