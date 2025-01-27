package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Byte],T_A[Int])]
case class CC_B(a: CC_A, b: T_A[Boolean], c: T_A[CC_A]) extends T_A[(T_A[Byte],T_A[Int])]
case class CC_C(a: T_A[CC_B], b: T_A[CC_B], c: (CC_B,T_A[CC_B])) extends T_A[(T_A[Byte],T_A[Int])]

val v_a: T_A[(T_A[Byte],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}