package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: ((Byte,Char),T_A[Byte]), b: T_A[T_A[Boolean]], c: Byte) extends T_A[T_A[(Boolean,Char)]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[(Boolean,Char)]]
case class CC_C() extends T_A[CC_A]

val v_a: T_A[T_A[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_C()) => 1 
}
}