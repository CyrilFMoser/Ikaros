package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Int],T_A[(Boolean,Byte)])]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[(T_A[Int],T_A[(Boolean,Byte)])]
case class CC_C(a: T_A[CC_A], b: Boolean, c: CC_A) extends T_A[(T_A[Int],T_A[(Boolean,Byte)])]

val v_a: T_A[(T_A[Int],T_A[(Boolean,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C(_, _, CC_A()) => 2 
}
}