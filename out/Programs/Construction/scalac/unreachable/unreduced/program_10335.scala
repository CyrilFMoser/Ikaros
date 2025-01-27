package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_B(a: Char) extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_C(a: T_A[CC_B], b: T_A[CC_A], c: T_A[Byte]) extends T_A[(T_A[Boolean],T_A[Boolean])]

val v_a: T_A[(T_A[Boolean],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}