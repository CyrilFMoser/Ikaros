package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(T_A[Byte],T_B[Boolean])]
case class CC_B(a: T_A[T_A[Boolean]], b: Char) extends T_A[(T_A[Byte],T_B[Boolean])]
case class CC_C[C](a: T_B[C], b: Char, c: (CC_B,T_A[CC_B])) extends T_B[C]

val v_a: T_A[(T_A[Byte],T_B[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}