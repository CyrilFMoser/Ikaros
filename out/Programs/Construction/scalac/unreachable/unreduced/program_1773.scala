package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: D) extends T_A[D]
case class CC_B(a: (CC_A[Byte],T_B[Char, Boolean])) extends T_B[T_B[T_A[Byte], Int], CC_A[CC_A[(Boolean,Int)]]]
case class CC_C(a: CC_A[T_A[CC_B]]) extends T_B[T_B[T_A[Byte], Int], CC_A[CC_A[(Boolean,Int)]]]

val v_a: T_B[T_B[T_A[Byte], Int], CC_A[CC_A[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(CC_A(_, _)) => 1 
}
}