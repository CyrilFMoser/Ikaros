package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_A, c: T_B[(T_A,(Boolean,Char))]) extends T_A
case class CC_B(a: T_A, b: Boolean) extends T_A
case class CC_C() extends T_B[T_B[Int]]
case class CC_D(a: CC_A) extends T_B[T_B[Int]]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, CC_A(_, _, _), _)) => 1 
  case CC_D(CC_A(_, CC_B(_, _), _)) => 2 
}
}