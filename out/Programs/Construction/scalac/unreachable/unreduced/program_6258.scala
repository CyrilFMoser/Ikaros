package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_A]) extends T_A
case class CC_B() extends T_B[T_A]
case class CC_C(a: Byte, b: T_A, c: T_B[T_B[T_A]]) extends T_B[T_A]
case class CC_D(a: T_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
  case CC_A(CC_C(_, CC_A(_, _), _), _) => 1 
  case CC_A(CC_D(CC_A(_, _)), _) => 2 
}
}