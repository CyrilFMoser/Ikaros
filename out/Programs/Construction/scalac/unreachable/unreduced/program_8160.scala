package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Boolean])) extends T_A[(T_A[Byte],T_A[Boolean])]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[CC_A]]]
case class CC_C(a: CC_B) extends T_A[(T_A[Byte],T_A[Boolean])]

val v_a: T_A[(T_A[Byte],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_C(CC_B(CC_A(_))) => 1 
}
}