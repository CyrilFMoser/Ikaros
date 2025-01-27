package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, T_B],Boolean)) extends T_A[C, Int]
case class CC_B[D](a: T_A[D, Int]) extends T_A[D, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A((_,_))) => 1 
  case CC_B(CC_B(_)) => 2 
}
}