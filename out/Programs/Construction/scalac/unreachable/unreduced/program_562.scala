package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, Int]
case class CC_B() extends T_B[CC_A[T_A[(Boolean,Char), (Byte,Int)]]]
case class CC_C(a: CC_B, b: CC_B, c: T_A[(CC_B,CC_B), T_B[CC_B]]) extends T_B[CC_A[T_A[(Boolean,Char), (Byte,Int)]]]

val v_a: T_B[CC_A[T_A[(Boolean,Char), (Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_B(), _) => 1 
}
}