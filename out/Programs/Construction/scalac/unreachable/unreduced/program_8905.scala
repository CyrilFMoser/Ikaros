package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: ((T_B,T_B),Int), b: Byte, c: C) extends T_A[C, T_B]
case class CC_B[D](a: D) extends T_A[D, T_B]
case class CC_C() extends T_B
case class CC_D(a: (CC_A[CC_C],T_B), b: ((CC_C,T_B),T_B)) extends T_B
case class CC_E(a: T_A[T_A[CC_C, T_B], CC_C], b: CC_B[(Int,T_B)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
  case CC_E(_, CC_B((_,_))) => 2 
}
}