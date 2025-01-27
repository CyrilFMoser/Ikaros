package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: Char, c: T_B[Int]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[CC_A], b: T_A, c: T_B[CC_A]) extends T_B[CC_A]
case class CC_E(a: T_B[Byte]) extends T_B[CC_A]
case class CC_F() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _, _), _) => 0 
  case CC_D(_, CC_B(), _) => 1 
  case CC_D(_, CC_C(), _) => 2 
  case CC_E(_) => 3 
  case CC_F() => 4 
}
}