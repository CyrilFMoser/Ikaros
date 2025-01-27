package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[(Byte,Int)]]]
case class CC_B(a: T_A[T_A[(Boolean,Byte)]], b: T_B[T_B[CC_A]]) extends T_B[T_B[CC_A]]
case class CC_C[C]() extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_B(_, CC_C()) => 1 
  case CC_C() => 2 
}
}