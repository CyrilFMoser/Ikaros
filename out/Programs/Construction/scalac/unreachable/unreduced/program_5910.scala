package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (CC_B,Char), b: T_B[Int]) extends T_B[Int]
case class CC_D(a: CC_B, b: T_B[T_A]) extends T_B[Int]
case class CC_E(a: CC_D) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B())) => 1 
  case CC_A(_, CC_B()) => 2 
  case CC_B() => 3 
}
}