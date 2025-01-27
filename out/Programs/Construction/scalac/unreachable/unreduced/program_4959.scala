package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Int], c: T_A[Int]) extends T_A[Int]
case class CC_B() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
}
}