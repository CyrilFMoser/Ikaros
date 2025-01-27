package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Int) extends T_A[Int]
case class CC_B(a: CC_A, b: T_A[Char], c: (T_A[Int],T_A[CC_A])) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), 12) => 0 
  case CC_A(CC_A(CC_A(_, _), _), _) => 1 
  case CC_A(CC_A(CC_B(_, _, _), _), 12) => 2 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 3 
  case CC_A(CC_B(CC_A(_, _), _, _), 12) => 4 
  case CC_A(CC_B(CC_A(_, _), _, _), _) => 5 
  case CC_B(_, _, _) => 6 
}
}