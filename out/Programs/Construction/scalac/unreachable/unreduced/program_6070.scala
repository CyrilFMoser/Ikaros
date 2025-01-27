package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[Char]) extends T_A[D]
case class CC_C() extends T_A[T_A[CC_A[Char]]]
case class CC_D() extends T_B[CC_C]
case class CC_E() extends T_B[CC_C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_), _), _) => 1 
  case CC_A(CC_B(_), _) => 2 
  case CC_B(CC_A(CC_A(_, _), _)) => 3 
  case CC_B(CC_A(CC_B(_), _)) => 4 
  case CC_B(CC_B(CC_A(_, _))) => 5 
  case CC_B(CC_B(CC_B(_))) => 6 
}
}