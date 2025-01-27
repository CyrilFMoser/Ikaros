package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, Int],T_B[Byte, T_A]), b: T_B[T_B[T_A, Byte], T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C](a: Boolean, b: (Boolean,CC_A), c: CC_C) extends T_B[C, (CC_B,T_B[CC_A, CC_B])]
case class CC_E[D]() extends T_B[D, (CC_B,T_B[CC_A, CC_B])]

val v_a: T_B[Char, (CC_B,T_B[CC_A, CC_B])] = null
val v_b: Int = v_a match{
  case CC_D(_, (_,CC_A(_, _)), CC_C(CC_A(_, _))) => 0 
  case CC_E() => 1 
}
}