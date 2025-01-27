package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_B[Boolean, E]
case class CC_C(a: T_A[((Int,Char),Boolean)], b: CC_B[CC_B[Int]]) extends T_B[Byte, T_B[T_A[Int], T_B[Boolean, Int]]]
case class CC_D(a: (Int,CC_C), b: T_A[Int]) extends T_B[Boolean, (CC_B[CC_C],T_B[Boolean, CC_C])]

val v_a: T_B[Boolean, (CC_B[CC_C],T_B[Boolean, CC_C])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_D(_, _) => 1 
}
}