package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: (T_B[Byte],T_B[Byte]), b: Char, c: (T_A[Int],CC_A[(Int,Int)])) extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_C() extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_D(a: T_A[CC_C], b: T_A[CC_A[CC_B]], c: Byte) extends T_B[CC_C]
case class CC_E(a: Byte, b: T_B[CC_D], c: CC_A[Char]) extends T_B[CC_C]
case class CC_F(a: Int, b: T_B[T_A[CC_D]]) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(), _) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(_, _) => 2 
}
}