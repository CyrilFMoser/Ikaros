package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[(Byte,Int)]]
case class CC_B(a: CC_A, b: T_A[(CC_A,Byte)], c: (CC_A,T_B[CC_A])) extends T_A[T_B[(Byte,Int)]]
case class CC_C(a: CC_A, b: Byte) extends T_A[T_B[(Byte,Int)]]
case class CC_D(a: CC_B, b: T_A[CC_C]) extends T_B[CC_C]
case class CC_E[C]() extends T_B[C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_A(), _, _), _) => 0 
  case CC_E() => 1 
}
}