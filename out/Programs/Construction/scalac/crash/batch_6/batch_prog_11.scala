package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[(T_A[T_B],T_B)]
case class CC_B(a: ((CC_A,Char),Byte)) extends T_A[(T_A[T_B],T_B)]
case class CC_C[B]() extends T_A[B]
case class CC_D(a: T_B, b: (Byte,(T_B,Int))) extends T_B
case class CC_E(a: (CC_A,CC_D), b: CC_A) extends T_B

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}