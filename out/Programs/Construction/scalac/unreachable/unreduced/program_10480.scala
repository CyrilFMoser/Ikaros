package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_A[(Byte,Int), T_B], Boolean]]
case class CC_B(a: Byte, b: T_A[T_B, (T_B,T_B)], c: T_B) extends T_B
case class CC_C(a: T_A[CC_B, T_B], b: (T_B,Char), c: CC_B) extends T_B
case class CC_D(a: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 0 
  case CC_B(_, _, CC_B(_, _, CC_C(_, _, _))) => 1 
  case CC_B(_, _, CC_B(_, _, CC_D(_))) => 2 
  case CC_B(_, _, CC_C(_, _, CC_B(_, _, _))) => 3 
  case CC_B(_, _, CC_D(_)) => 4 
  case CC_C(_, _, _) => 5 
  case CC_D(_) => 6 
}
}