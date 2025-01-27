package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Int, b: Int) extends T_A[Boolean, Boolean]
case class CC_B(a: T_A[T_B[(Boolean,Int)], CC_A], b: T_A[(CC_A,CC_A), (CC_A,CC_A)], c: Int) extends T_B[(CC_A,T_A[Boolean, Boolean])]
case class CC_C[D, E](a: E, b: Boolean, c: Boolean) extends T_B[D]
case class CC_D() extends T_B[(CC_A,T_A[Boolean, Boolean])]

val v_a: T_B[(CC_A,T_A[Boolean, Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D() => 2 
}
}