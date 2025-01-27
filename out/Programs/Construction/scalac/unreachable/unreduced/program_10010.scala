package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[Boolean, Int], c: T_B) extends T_A[Boolean, Int]
case class CC_B(a: (T_B,T_A[Boolean, Int]), b: T_A[Boolean, Int]) extends T_B
case class CC_C(a: T_B, b: CC_A[CC_B]) extends T_B
case class CC_D(a: T_A[CC_B, CC_B], b: (Byte,T_A[Boolean, Int]), c: T_B) extends T_B

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B((_,_), CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_C(CC_B(_, _), _)) => 1 
  case CC_A(_, _, CC_C(CC_C(_, _), _)) => 2 
  case CC_A(_, _, CC_C(CC_D(_, _, _), _)) => 3 
  case CC_A(_, _, CC_D(_, _, CC_B(_, _))) => 4 
  case CC_A(_, _, CC_D(_, _, CC_C(_, _))) => 5 
  case CC_A(_, _, CC_D(_, _, CC_D(_, _, _))) => 6 
}
}