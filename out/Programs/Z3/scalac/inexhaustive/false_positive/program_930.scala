package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B() extends T_B
case class CC_C(a: T_A[(Byte,Byte), CC_B], b: T_B) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D()) => 0 
}
}
// This is not matched: (CC_E (Tuple (CC_E Wildcard Wildcard (CC_C T_A) T_B) Wildcard)
//      Wildcard
//      (CC_B Boolean T_A)
//      T_B)