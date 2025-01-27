package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (Byte,Byte), b: T_B[CC_A, CC_A], c: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C]() extends T_B[C, (CC_A,(Char,CC_A))]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _, _) => 1 
}
}