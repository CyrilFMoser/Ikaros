package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Byte],T_A[Boolean])]
case class CC_B(a: T_A[T_A[(Boolean,Int)]], b: Char) extends T_A[(T_A[Byte],T_A[Boolean])]
case class CC_C(a: CC_A, b: T_A[(CC_A,CC_A)]) extends T_A[(T_A[Byte],T_A[Boolean])]

val v_a: T_A[(T_A[Byte],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 'x') => 1 
  case CC_B(_, _) => 2 
  case CC_C(CC_A(), _) => 3 
}
}