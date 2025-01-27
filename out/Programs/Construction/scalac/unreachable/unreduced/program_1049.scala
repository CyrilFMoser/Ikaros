package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: Char) extends T_A[C, Int]
case class CC_B[D]() extends T_A[D, Int]
case class CC_C[E](a: T_A[E, Int]) extends T_A[E, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _)) => 2 
  case CC_C(CC_B()) => 3 
  case CC_C(CC_C(_)) => 4 
}
}