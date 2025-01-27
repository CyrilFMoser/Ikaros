package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_B, T_B], C]
case class CC_B[D]() extends T_A[T_A[T_B, T_B], (T_B,CC_A[(Byte,Boolean)])]
case class CC_C[E](a: T_A[T_A[T_B, T_B], E], b: CC_B[E]) extends T_A[T_A[T_B, T_B], E]
case class CC_D(a: Byte, b: T_B) extends T_B
case class CC_E(a: T_A[T_A[T_B, T_B], Char], b: CC_A[T_A[(Int,Byte), T_B]]) extends T_B
case class CC_F(a: (CC_E,CC_E)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, _)) => 0 
  case CC_D(_, CC_F(_)) => 1 
  case CC_E(_, CC_A(_)) => 2 
  case CC_F((_,_)) => 3 
}
}
// This is not matched: CC_D(_, CC_E(_, _))