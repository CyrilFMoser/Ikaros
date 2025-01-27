package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_A[T_B, T_B])) extends T_A[T_A[(T_B,T_B), T_B], C]
case class CC_B[D](a: T_B, b: D) extends T_A[T_A[(T_B,T_B), T_B], D]
case class CC_C[E](a: E, b: E, c: T_B) extends T_A[T_A[(T_B,T_B), T_B], E]
case class CC_D(a: T_A[T_A[(Boolean,Byte), Boolean], Byte], b: T_B) extends T_B
case class CC_E(a: (T_A[T_B, CC_D],(T_B,CC_D)), b: (CC_C[CC_D],CC_A[CC_D]), c: CC_C[CC_B[T_B]]) extends T_B
case class CC_F(a: T_A[CC_A[T_B], CC_C[CC_E]], b: CC_B[T_A[Byte, CC_E]], c: T_A[CC_D, Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, _)) => 0 
  case CC_D(_, CC_E((_,_), (_,_), CC_C(_, _, _))) => 1 
  case CC_D(_, CC_F(_, _, _)) => 2 
  case CC_E(_, _, _) => 3 
  case CC_F(_, CC_B(CC_D(_, _), _), _) => 4 
  case CC_F(_, CC_B(CC_E(_, _, _), _), _) => 5 
  case CC_F(_, CC_B(CC_F(_, _, _), _), _) => 6 
}
}