package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[Int]
case class CC_B(a: T_A[Int], b: T_A[Char]) extends T_A[Int]
case class CC_C(a: CC_A, b: Boolean, c: CC_A) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(_, _, _), _) => 3 
  case CC_C(CC_A(_), _, CC_A(_)) => 4 
}
}