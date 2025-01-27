package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[Int]
case class CC_B(a: T_A[T_A[Int]], b: Char) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _)))