package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A) extends T_A
case class CC_B(a: T_B[Int], b: T_B[CC_A]) extends T_B[Int]
case class CC_C(a: T_B[T_B[Char]], b: CC_B) extends T_B[Int]
case class CC_D() extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_B(CC_C(_, _), _)) => 1 
  case CC_C(_, CC_B(CC_D(), _)) => 2 
  case CC_D() => 3 
}
}
// This is not matched: CC_C(_, CC_B(CC_B(_, _), _))