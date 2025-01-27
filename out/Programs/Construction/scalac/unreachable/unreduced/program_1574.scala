package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_B[CC_A], b: Boolean) extends T_A
case class CC_C() extends T_B[Int]
case class CC_D(a: T_B[Int], b: CC_C, c: T_B[CC_C]) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_B(_, _), _, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _)) => 2 
  case CC_A(CC_B(_, _), _, CC_B(_, _)) => 3 
  case CC_B(_, _) => 4 
}
}