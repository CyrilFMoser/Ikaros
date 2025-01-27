package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(T_A[Byte, Byte],Byte), (T_A[Boolean, Byte],T_A[Byte, Int])]
case class CC_B(a: T_A[CC_A, (CC_A,CC_A)], b: T_A[(CC_A,CC_A), T_A[CC_A, CC_A]]) extends T_A[(T_A[Byte, Byte],Byte), (T_A[Boolean, Byte],T_A[Byte, Int])]
case class CC_C(a: CC_B) extends T_A[(T_A[Byte, Byte],Byte), (T_A[Boolean, Byte],T_A[Byte, Int])]

val v_a: T_A[(T_A[Byte, Byte],Byte), (T_A[Boolean, Byte],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}