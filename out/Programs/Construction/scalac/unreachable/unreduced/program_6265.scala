package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Char]], b: (T_A[Int],T_A[Char]), c: T_A[(Int,Byte)]) extends T_A[T_B[T_A[Boolean], T_A[Int]]]
case class CC_B(a: CC_A) extends T_A[T_B[T_A[Boolean], T_A[Int]]]
case class CC_C[D](a: D, b: Boolean) extends T_B[D, CC_B]
case class CC_D(a: Int) extends T_B[(T_B[CC_A, CC_B],T_A[Boolean]), CC_B]
case class CC_E() extends T_B[T_A[CC_C[CC_B]], CC_B]

val v_a: T_B[T_B[(T_B[CC_A, CC_B],T_A[Boolean]), CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_C((_,_), _), _) => 0 
  case CC_C(CC_D(12), _) => 1 
}
}
// This is not matched: CC_C(CC_D(_), _)