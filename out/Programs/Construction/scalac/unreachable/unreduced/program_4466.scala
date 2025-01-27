package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int) extends T_A[T_B[Int]]
case class CC_B(a: T_B[((Byte,Boolean),Char)]) extends T_A[T_B[Int]]
case class CC_C(a: Char, b: Char, c: T_A[CC_A]) extends T_A[T_B[Int]]
case class CC_D(a: CC_B, b: CC_A, c: T_A[CC_C]) extends T_B[CC_C]
case class CC_E[C]() extends T_B[C]
case class CC_F(a: T_B[T_B[CC_C]], b: Byte, c: CC_B) extends T_B[CC_C]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}