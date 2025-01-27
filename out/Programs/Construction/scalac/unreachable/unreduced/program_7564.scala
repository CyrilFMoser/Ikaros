package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[(T_A[T_B, T_B],T_B), C]
case class CC_B[D]() extends T_A[(T_A[T_B, T_B],T_B), D]
case class CC_C[E](a: CC_A[E], b: T_A[E, Byte], c: ((Byte,T_B),(T_B,T_B))) extends T_A[(T_A[T_B, T_B],T_B), E]
case class CC_D(a: CC_B[T_A[T_B, T_B]], b: CC_B[Boolean]) extends T_B
case class CC_E(a: Char) extends T_B
case class CC_F(a: CC_A[T_B], b: (Byte,CC_C[CC_D]), c: T_A[CC_B[Int], CC_C[CC_E]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_F(CC_A(), (_,CC_C(_, _, _)), _) => 1 
}
}
// This is not matched: CC_E(_)