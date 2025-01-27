package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_B[(CC_A,(Byte,Byte))]) extends T_A
case class CC_C() extends T_B[T_B[Byte]]
case class CC_D(a: Boolean, b: CC_C, c: T_A) extends T_B[T_B[Byte]]

val v_a: T_B[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_C(), CC_B(_)) => 1 
}
}
// This is not matched: CC_D(_, CC_C(), CC_A(_))