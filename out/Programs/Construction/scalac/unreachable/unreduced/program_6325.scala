package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Byte]
case class CC_B(a: CC_A[T_A[T_B, Int]], b: Char, c: T_B) extends T_B
case class CC_C(a: T_A[T_A[CC_B, Byte], Byte], b: T_A[T_A[CC_B, CC_B], Byte]) extends T_B
case class CC_D(a: (CC_B,T_B), b: T_A[T_A[CC_C, (Int,Byte)], Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
  case CC_B(_, _, CC_C(CC_A(_), CC_A(_))) => 1 
  case CC_B(_, _, CC_D((_,_), CC_A(_))) => 2 
  case CC_C(_, CC_A(_)) => 3 
  case CC_D(_, CC_A(_)) => 4 
}
}