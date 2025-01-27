package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Int, b: T_A[T_B[Byte], T_B[Int]], c: T_B[Byte]) extends T_A[T_B[Int], T_A[T_A[Byte, Int], Boolean]]
case class CC_B(a: CC_A, b: Int, c: CC_A) extends T_A[T_B[Int], T_A[T_A[Byte, Int], Boolean]]
case class CC_C() extends T_B[CC_A]
case class CC_D(a: CC_C, b: CC_B) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_B(_, 12, CC_A(_, _, _))) => 1 
  case CC_D(CC_C(), CC_B(_, _, CC_A(_, _, _))) => 2 
  case CC_E() => 3 
}
}