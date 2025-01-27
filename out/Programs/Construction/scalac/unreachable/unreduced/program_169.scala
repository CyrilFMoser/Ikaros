package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B() extends T_B[(T_A[Byte],Char)]
case class CC_C(a: (Boolean,(CC_B,CC_B)), b: T_A[CC_A[CC_B]], c: T_A[Boolean]) extends T_B[(T_A[Byte],Char)]
case class CC_D(a: Byte, b: Boolean) extends T_B[(T_A[Byte],Char)]

val v_a: T_B[(T_A[Byte],Char)] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_), CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_D(_, _) => 2 
}
}