package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[(Int,Int)]]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_B(_), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_A(_, _), CC_A(CC_B(_), CC_A(_, _))) => 2 
  case CC_A(CC_B(_), CC_A(CC_B(_), CC_A(_, _))) => 3 
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_B(_))) => 4 
  case CC_A(CC_B(_), CC_A(CC_A(_, _), CC_B(_))) => 5 
  case CC_A(CC_A(_, _), CC_A(CC_B(_), CC_B(_))) => 6 
  case CC_A(CC_B(_), CC_A(CC_B(_), CC_B(_))) => 7 
  case CC_A(CC_A(_, _), CC_B(_)) => 8 
  case CC_A(CC_B(_), CC_B(_)) => 9 
  case CC_B(_) => 10 
}
}