package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C) extends T_A[(T_A[(Int,Char), Int],T_A[T_B, Byte]), C]
case class CC_B(a: T_A[(T_B,T_B), T_B], b: (T_A[Byte, Boolean],CC_A[T_B]), c: T_A[Byte, CC_A[T_B]]) extends T_A[T_A[CC_A[T_B], T_B], T_B]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[CC_B, CC_C], (CC_B,CC_B)], b: CC_B, c: CC_A[Int]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[(T_A[(Int,Char), Int],T_A[T_B, Byte]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
  case CC_A(CC_D(_, CC_B(_, _, _), CC_A(_, _)), _) => 1 
  case CC_A(CC_E(), _) => 2 
}
}