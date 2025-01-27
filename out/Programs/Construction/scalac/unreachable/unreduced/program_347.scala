package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: C) extends T_A[(T_A[Byte],T_A[Char])]
case class CC_B(a: Boolean) extends T_A[(T_A[Byte],T_A[Char])]
case class CC_C(a: T_A[(CC_B,Char)], b: T_A[CC_A[CC_B]], c: CC_B) extends T_A[(T_A[Byte],T_A[Char])]
case class CC_D(a: (CC_A[CC_C],T_A[CC_B]), b: CC_C) extends T_B[CC_A[T_A[CC_B]]]
case class CC_E() extends T_B[T_A[Boolean]]

val v_a: T_A[(T_A[Byte],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}