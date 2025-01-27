package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_A[T_B, T_B], T_A[T_B, (Int,Char)]]]
case class CC_B[D](a: Boolean) extends T_A[D, T_A[T_A[T_B, T_B], T_A[T_B, (Int,Char)]]]
case class CC_C(a: CC_B[(T_B,T_B)], b: (CC_A[T_B],T_A[T_B, T_B]), c: T_B) extends T_A[(Boolean,(Int,Boolean)), T_A[T_A[T_B, T_B], T_A[T_B, (Int,Char)]]]
case class CC_D(a: Char, b: T_B) extends T_B
case class CC_E(a: Int, b: T_B) extends T_B
case class CC_F(a: T_A[Boolean, CC_E], b: T_B, c: CC_E) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, CC_E(_, _)) => 0 
  case CC_E(_, CC_F(_, _, _)) => 1 
}
}
// This is not matched: CC_E(_, CC_D(_, _))