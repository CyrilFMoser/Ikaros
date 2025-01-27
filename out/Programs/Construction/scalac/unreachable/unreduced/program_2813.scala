package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,T_A[Int]), b: T_A[T_A[Char]]) extends T_A[(T_A[Boolean],T_A[Byte])]
case class CC_B(a: CC_A, b: CC_A, c: Boolean) extends T_A[(T_A[Boolean],T_A[Byte])]
case class CC_C() extends T_A[(T_A[Boolean],T_A[Byte])]

val v_a: T_A[(T_A[Boolean],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}