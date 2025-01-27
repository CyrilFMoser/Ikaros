package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: Byte) extends T_A[Int]
case class CC_C(a: T_A[Int], b: T_A[CC_A]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(0) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_A(), _) => 3 
  case CC_C(CC_B(0), _) => 4 
  case CC_C(CC_B(_), _) => 5 
  case CC_C(CC_C(_, _), _) => 6 
}
}