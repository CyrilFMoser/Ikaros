package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Byte,Boolean), C], C]
case class CC_B() extends T_A[T_A[(Byte,Boolean), CC_A[CC_A[Boolean]]], CC_A[CC_A[Boolean]]]
case class CC_C(a: T_A[CC_B, CC_B], b: CC_B, c: CC_B) extends T_A[T_A[(Byte,Boolean), CC_A[CC_A[Boolean]]], CC_A[CC_A[Boolean]]]

val v_a: T_A[T_A[(Byte,Boolean), CC_A[CC_A[Boolean]]], CC_A[CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_B(), CC_B()) => 1 
}
}
// This is not matched: CC_B()