package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int], b: T_A[(T_B,T_B)]) extends T_A[Int]
case class CC_B(a: T_A[Int]) extends T_A[Int]
case class CC_C() extends T_B
case class CC_D(a: T_A[Int], b: CC_C, c: T_A[Int]) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_A(_, _), _)) => 1 
  case CC_B(CC_A(CC_B(_), _)) => 2 
  case CC_B(CC_B(CC_A(_, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
}
}