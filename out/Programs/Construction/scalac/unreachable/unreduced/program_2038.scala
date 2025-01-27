package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[B](a: T_B[T_B[Byte]]) extends T_B[T_B[Byte]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, CC_A(_, _))) => 1 
  case CC_B(_, CC_A(_, CC_B(_, _))) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(_, CC_A(_, CC_C()))