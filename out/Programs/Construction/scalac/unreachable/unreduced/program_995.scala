package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],Int)) extends T_A[Int]
case class CC_B(a: T_A[Int]) extends T_A[Int]
case class CC_C(a: T_A[CC_B], b: T_A[Int]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(_, _)) => 3 
  case CC_C(_, _) => 4 
}
}