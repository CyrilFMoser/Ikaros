package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int]) extends T_A[Int]
case class CC_B(a: T_B) extends T_A[Int]
case class CC_C(a: T_A[Char]) extends T_A[Int]
case class CC_D(a: CC_A, b: T_B, c: CC_B) extends T_B
case class CC_E(a: CC_D, b: Boolean, c: CC_D) extends T_B
case class CC_F(a: CC_E) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_)) => 3 
  case CC_A(CC_C(_)) => 4 
  case CC_B(CC_D(CC_A(_), CC_D(_, _, _), CC_B(_))) => 5 
  case CC_B(CC_D(CC_A(_), CC_E(_, _, _), CC_B(_))) => 6 
  case CC_B(CC_D(CC_A(_), CC_F(_), CC_B(_))) => 7 
  case CC_B(CC_E(CC_D(_, _, _), _, _)) => 8 
  case CC_B(CC_F(CC_E(_, _, _))) => 9 
  case CC_C(_) => 10 
}
}