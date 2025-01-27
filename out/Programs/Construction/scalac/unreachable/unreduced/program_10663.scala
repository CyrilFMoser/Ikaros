package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(T_A[Int, (Byte,Char)],T_A[Boolean, Byte]), C]
case class CC_B[D](a: T_A[D, D], b: Boolean) extends T_A[(T_A[Int, (Byte,Char)],T_A[Boolean, Byte]), D]
case class CC_C() extends T_A[(T_A[Int, (Byte,Char)],T_A[Boolean, Byte]), CC_A[CC_A[Boolean]]]

val v_a: T_A[(T_A[Int, (Byte,Char)],T_A[Boolean, Byte]), Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}