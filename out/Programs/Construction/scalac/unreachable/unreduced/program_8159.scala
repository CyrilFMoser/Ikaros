package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[(Boolean,((Int,Char),Char)), T_A[T_A[Char, Char], T_A[Char, Boolean]]]
case class CC_B(a: CC_A) extends T_B[T_B[T_B[CC_A, CC_A], T_A[Boolean, CC_A]], T_A[Boolean, T_B[Byte, CC_A]]]
case class CC_C(a: CC_A) extends T_B[T_B[T_B[CC_A, CC_A], T_A[Boolean, CC_A]], T_A[Boolean, T_B[Byte, CC_A]]]
case class CC_D(a: T_A[T_B[CC_C, CC_A], Boolean]) extends T_B[T_B[T_B[CC_A, CC_A], T_A[Boolean, CC_A]], T_A[Boolean, T_B[Byte, CC_A]]]

val v_a: T_B[T_B[T_B[CC_A, CC_A], T_A[Boolean, CC_A]], T_A[Boolean, T_B[Byte, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C(CC_A())