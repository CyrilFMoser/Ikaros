package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char) extends T_A[(T_B[Int, Char],T_A[Byte])]
case class CC_B(a: T_B[Char, CC_A]) extends T_B[T_A[T_A[CC_A]], T_A[Byte]]
case class CC_C() extends T_B[T_A[T_A[CC_A]], T_A[Byte]]

val v_a: T_B[T_A[T_A[CC_A]], T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}