package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_A[(Byte,Char), T_B], Byte]]
case class CC_B(a: T_A[(T_B,T_B), CC_A[T_B]], b: T_A[T_A[T_B, T_B], T_A[T_B, T_B]]) extends T_A[T_A[T_B, CC_A[T_B]], T_A[T_A[(Byte,Char), T_B], Byte]]
case class CC_C(a: (CC_A[T_B],(CC_B,CC_B))) extends T_A[T_A[T_B, CC_A[T_B]], T_A[T_A[(Byte,Char), T_B], Byte]]
case class CC_D() extends T_B
case class CC_E(a: CC_C, b: T_B, c: Int) extends T_B

val v_a: T_A[T_A[T_B, CC_A[T_B]], T_A[T_A[(Byte,Char), T_B], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C((CC_A(),(_,_))) => 2 
}
}