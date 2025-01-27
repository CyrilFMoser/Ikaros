package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte], b: Byte, c: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_A, b: (CC_A,T_B[T_A]), c: CC_B) extends T_B[T_A]
case class CC_E() extends T_B[T_A]
case class CC_F(a: T_B[(CC_A,T_A)], b: CC_A, c: T_B[T_A]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}