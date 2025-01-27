package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: (CC_A[Boolean],T_A[(Int,Boolean)]), b: T_B[CC_A[Boolean]]) extends T_B[Int]
case class CC_C(a: CC_A[T_B[CC_B]], b: T_A[(CC_B,CC_B)], c: ((Char,Char),T_B[Int])) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),CC_A()), _) => 0 
  case CC_C(_, _, _) => 1 
}
}