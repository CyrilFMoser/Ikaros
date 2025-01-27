package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char) extends T_A[(Boolean,Byte)]
case class CC_B(a: (T_A[CC_A],(CC_A,CC_A))) extends T_A[(Boolean,Byte)]
case class CC_C(a: Byte, b: CC_A) extends T_A[(Boolean,Byte)]
case class CC_D[C](a: Int, b: T_A[(Boolean,Byte)]) extends T_B[C]

val v_a: T_A[(Boolean,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_)) => 1 
  case CC_C(_, CC_A(_)) => 2 
}
}