package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: Boolean) extends T_A[(T_A[Byte],T_A[Boolean])]
case class CC_B(a: T_A[Char], b: T_A[T_A[CC_A]], c: CC_A) extends T_A[(T_A[Byte],T_A[Boolean])]
case class CC_C(a: CC_B, b: Boolean) extends T_A[(T_A[Byte],T_A[Boolean])]

val v_a: T_A[(T_A[Byte],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
  case CC_C(_, _) => 2 
}
}