package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: (CC_A[Char],(Char,Boolean)), b: ((Byte,(Byte,Int)),T_B[Char])) extends T_B[E]
case class CC_C[F, G]() extends T_B[F]
case class CC_D[H](a: T_A[H, H], b: H, c: H) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_B((CC_A(_),(_,_)), _)