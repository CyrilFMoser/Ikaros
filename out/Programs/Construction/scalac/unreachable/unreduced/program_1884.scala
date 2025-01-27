package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Boolean,Boolean), T_A], T_B[(Byte,Char), Boolean]], b: T_B[T_A, T_B[T_A, Char]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (T_B[CC_B, Int],T_B[CC_B, Int]), b: T_A, c: CC_B) extends T_A
case class CC_D[C]() extends T_B[(T_B[(Byte,Byte), (Byte,Byte)],Byte), C]
case class CC_E[D](a: CC_D[D]) extends T_B[(T_B[(Byte,Byte), (Byte,Byte)],Byte), D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _, CC_B()) => 1 
}
}
// This is not matched: CC_B()