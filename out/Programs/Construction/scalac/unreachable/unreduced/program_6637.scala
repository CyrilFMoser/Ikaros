package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Int]
case class CC_B[D]() extends T_A[D, Int]
case class CC_C(a: CC_A[T_A[T_B, Int]], b: T_A[Boolean, Int], c: T_A[T_A[T_B, Char], CC_A[Int]]) extends T_A[Boolean, Int]
case class CC_D(a: CC_B[CC_A[CC_C]], b: T_A[Boolean, Int], c: Int) extends T_B
case class CC_E(a: T_B) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), CC_A(), _) => 0 
  case CC_D(CC_B(), CC_B(), _) => 1 
  case CC_D(CC_B(), CC_C(CC_A(), CC_A(), _), _) => 2 
  case CC_D(CC_B(), CC_C(CC_A(), CC_B(), _), _) => 3 
  case CC_D(CC_B(), CC_C(CC_A(), CC_C(_, _, _), _), _) => 4 
  case CC_E(CC_D(CC_B(), CC_A(), 12)) => 5 
  case CC_E(CC_D(CC_B(), CC_B(), 12)) => 6 
  case CC_E(CC_D(CC_B(), CC_B(), _)) => 7 
  case CC_E(CC_D(CC_B(), CC_C(_, _, _), 12)) => 8 
  case CC_E(CC_D(CC_B(), CC_C(_, _, _), _)) => 9 
  case CC_E(CC_E(CC_D(_, _, _))) => 10 
  case CC_E(CC_E(CC_E(_))) => 11 
  case CC_E(CC_E(CC_F())) => 12 
  case CC_E(CC_F()) => 13 
  case CC_F() => 14 
}
}
// This is not matched: CC_E(CC_D(CC_B(), CC_A(), _))