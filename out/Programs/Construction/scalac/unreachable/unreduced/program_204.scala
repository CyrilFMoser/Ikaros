package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[D], b: C) extends T_A[C]
case class CC_B() extends T_A[CC_A[Byte, CC_A[Byte, Char]]]
case class CC_C(a: CC_A[T_B[CC_B], T_A[CC_B]], b: T_B[Int], c: (CC_B,CC_A[CC_B, CC_B])) extends T_A[CC_A[Byte, CC_A[Byte, Char]]]
case class CC_D() extends T_B[CC_B]
case class CC_E(a: T_B[CC_B]) extends T_B[CC_B]
case class CC_F(a: T_A[Byte], b: T_A[Boolean], c: T_B[CC_B]) extends T_B[CC_B]

val v_a: T_A[CC_A[Byte, CC_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, (_,_)) => 1 
}
}
// This is not matched: CC_A(_, CC_A(_, _))