package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: Char) extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C]) extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _)) => 2 
  case CC_B(CC_B(CC_A(_, _), _), CC_A(_, _)) => 3 
  case CC_B(CC_B(CC_B(_, _), _), CC_A(_, _)) => 4 
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), CC_A(_, _))) => 5 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_A(_, _), CC_A(_, _))) => 6 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_A(_, _), CC_A(_, _))) => 7 
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), CC_B(_, _))) => 8 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_A(_, _), CC_B(_, _))) => 9 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_A(_, _), CC_B(_, _))) => 10 
  case CC_B(CC_A(_, _), CC_B(CC_B(_, _), CC_A(_, _))) => 11 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_B(_, _), CC_A(_, _))) => 12 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_A(_, _))) => 13 
  case CC_B(CC_A(_, _), CC_B(CC_B(_, _), CC_B(_, _))) => 14 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_B(_, _), CC_B(_, _))) => 15 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_B(_, _))) => 16 
}
}