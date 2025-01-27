package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[(Int,Int)]], c: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B(a: T_A[Int]) extends T_A[Int]
case class CC_C() extends T_A[Int]
case class CC_D(a: T_B, b: (CC_A,Int)) extends T_B
case class CC_E(a: CC_B, b: CC_A) extends T_B
case class CC_F(a: CC_D) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_D(_, _), _), _, _) => 0 
  case CC_A(CC_D(CC_E(_, _), _), _, _) => 1 
  case CC_A(CC_D(CC_F(_), _), _, _) => 2 
  case CC_A(CC_E(CC_B(_), _), _, _) => 3 
  case CC_A(CC_F(CC_D(_, _)), _, _) => 4 
  case CC_B(CC_A(CC_D(_, _), _, _)) => 5 
  case CC_B(CC_A(CC_E(_, _), _, _)) => 6 
  case CC_B(CC_A(CC_F(_), _, _)) => 7 
  case CC_B(CC_B(CC_A(_, _, _))) => 8 
  case CC_B(CC_B(CC_B(_))) => 9 
  case CC_B(CC_B(CC_C())) => 10 
  case CC_B(CC_C()) => 11 
  case CC_C() => 12 
}
}