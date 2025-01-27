package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B[B](a: T_A[B], b: B, c: Boolean) extends T_A[B]
case class CC_C(a: T_A[Int]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A()) => 2 
  case CC_C(CC_B(_, 12, true)) => 3 
  case CC_C(CC_B(_, 12, false)) => 4 
  case CC_C(CC_B(_, _, true)) => 5 
  case CC_C(CC_B(_, _, false)) => 6 
  case CC_C(CC_C(CC_A())) => 7 
  case CC_C(CC_C(CC_B(_, _, _))) => 8 
  case CC_C(CC_C(CC_C(_))) => 9 
}
}