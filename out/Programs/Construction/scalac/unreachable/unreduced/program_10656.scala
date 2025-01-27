package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: Char, c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: Char, b: T_B[T_A]) extends T_B[T_A]
case class CC_C() extends T_B[T_A]
case class CC_D(a: CC_A) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_B(_, CC_C()) => 1 
  case CC_B(_, CC_D(CC_A(_, _, _))) => 2 
  case CC_C() => 3 
  case CC_D(CC_A(_, _, _)) => 4 
}
}