package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Byte, b: T_A) extends T_B[Int]
case class CC_E() extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)