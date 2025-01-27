package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, (T_B,T_B)]
case class CC_B(a: T_A[CC_A[T_B], T_B], b: T_A[T_A[T_B, Boolean], CC_A[T_B]], c: Char) extends T_B
case class CC_C(a: T_A[Int, CC_B], b: T_A[CC_A[Byte], Byte]) extends T_B
case class CC_D(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, 'x') => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
  case CC_D(_) => 3 
}
}