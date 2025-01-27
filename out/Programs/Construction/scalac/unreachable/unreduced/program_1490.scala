package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B](a: (T_A,T_B[Byte]), b: B, c: (CC_A,(Byte,Byte))) extends T_B[(CC_A,(CC_A,T_A))]
case class CC_C[C](a: CC_B[CC_A], b: C) extends T_B[(CC_A,(CC_A,T_A))]

val v_a: T_B[(CC_A,(CC_A,T_A))] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _, _) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
}
}