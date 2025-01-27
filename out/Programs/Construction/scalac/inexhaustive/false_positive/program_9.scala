package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E) extends T_A[E, (T_A[Char, (Int,Boolean)],T_A[Byte, Int])]
case class CC_B() extends T_A[(T_A[Byte, Int],Byte), (T_A[Char, (Int,Boolean)],T_A[Byte, Int])]
case class CC_C(a: Int, b: CC_B) extends T_A[(T_A[Byte, Int],Byte), (T_A[Char, (Int,Boolean)],T_A[Byte, Int])]
case class CC_E[I, H](a: Byte, b: T_B[H, CC_B], c: T_A[CC_B, H]) extends T_B[I, H]
case class CC_F[J](a: CC_E[CC_A[CC_C], J], b: Int) extends T_B[CC_A[T_B[(Int,Byte), CC_B]], J]

val v_a: T_A[T_A[(T_A[Byte, Int],Byte), (T_A[Char, (Int,Boolean)],T_A[Byte, Int])], (T_A[Char, (Int,Boolean)],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_A(_, CC_C(_, CC_B())) => 1 
}
}
// This is not matched: CC_B()