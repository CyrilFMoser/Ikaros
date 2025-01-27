package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[(Boolean,Byte)]]
case class CC_B(a: T_A[(Boolean,Int)], b: CC_A, c: (Char,T_B)) extends T_A[T_A[(Boolean,Byte)]]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,CC_D())) => 0 
}
}
// This is not matched: (CC_B Int Int (T_A Int Int))