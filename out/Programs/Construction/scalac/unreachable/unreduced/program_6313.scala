package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[Boolean]) extends T_A[D, T_A[D, D]]
case class CC_C(a: (CC_B[Byte],T_A[(Byte,Char), Char])) extends T_A[Int, T_A[Int, Int]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_)) => 3 
  case CC_A(CC_C((_,_))) => 4 
  case CC_B(CC_A(CC_A(_))) => 5 
  case CC_B(CC_A(CC_B(_))) => 6 
  case CC_C((CC_B(_),_)) => 7 
}
}