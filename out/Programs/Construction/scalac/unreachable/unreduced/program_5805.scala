package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_B[Boolean, (Byte,Byte)]], b: T_B[T_B[T_A, T_A], T_B[(Byte,Char), T_A]], c: (T_B[T_A, T_A],T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: Char) extends T_A
case class CC_D[C](a: T_B[CC_C, C], b: C, c: T_A) extends T_B[T_A, C]
case class CC_E[D]() extends T_B[T_A, D]
case class CC_F() extends T_B[T_A, (T_B[T_A, CC_C],(CC_A,CC_B))]

val v_a: T_B[T_A, (T_B[T_A, CC_C],(CC_A,CC_B))] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
  case CC_F() => 2 
}
}