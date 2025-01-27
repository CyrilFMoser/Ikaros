package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Char]) extends T_A[Char]
case class CC_B(a: T_A[Int]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_B(_) => 2 
}
}