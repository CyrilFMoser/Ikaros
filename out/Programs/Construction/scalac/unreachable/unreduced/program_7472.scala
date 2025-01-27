package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Byte, T_B[Byte, T_A]]) extends T_A
case class CC_C(a: (CC_B,(CC_A,Char))) extends T_A
case class CC_D[C](a: CC_C, b: T_B[C, C], c: C) extends T_B[(CC_A,T_B[CC_A, T_A]), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C((CC_B(_),(_,_)))