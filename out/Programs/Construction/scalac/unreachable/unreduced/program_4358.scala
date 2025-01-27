package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: CC_A[Boolean]) extends T_A[T_A[CC_A[Byte]]]
case class CC_C(a: CC_B, b: CC_A[CC_A[(Boolean,Byte)]], c: T_B[CC_A[CC_B]]) extends T_A[Boolean]
case class CC_D(a: CC_B, b: T_A[Boolean], c: (CC_B,(Int,Byte))) extends T_B[(CC_B,T_B[CC_B])]
case class CC_E() extends T_B[(CC_C,Byte)]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_A(), _) => 1 
}
}