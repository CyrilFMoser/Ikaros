package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B(a: T_A[Int], b: Int) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_B(CC_A(_, _), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
}
}