package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Byte) extends T_A[(Boolean,T_B)]
case class CC_B(a: T_A[CC_A], b: (T_B,CC_A)) extends T_A[(Boolean,T_B)]
case class CC_C(a: T_A[CC_B], b: CC_B, c: Boolean) extends T_B
case class CC_D(a: (CC_C,T_A[CC_B]), b: T_A[(Boolean,T_B)], c: CC_C) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((CC_C(_, _, _),_), CC_A(_, _), _) => 0 
  case CC_D((CC_C(_, _, _),_), CC_B(_, (_,_)), _) => 1 
  case CC_E() => 2 
}
}
// This is not matched: CC_C(_, _, _)