package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_A[Byte, (Boolean,Char)], T_A[T_A[Char, Char], T_B[Boolean]]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], T_B[CC_A]], b: (T_B[CC_A],T_A[(Byte,Boolean), (Boolean,Byte)])) extends T_A[T_A[Byte, (Boolean,Char)], T_A[T_A[Char, Char], T_B[Boolean]]]
case class CC_C() extends T_B[T_A[T_B[(Byte,Boolean)], T_A[CC_A, CC_A]]]
case class CC_D[D](a: CC_C, b: CC_B) extends T_B[T_A[T_B[(Byte,Boolean)], T_A[CC_A, CC_A]]]

val v_a: T_B[T_A[T_B[(Byte,Boolean)], T_A[CC_A, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_B(_, _)) => 1 
}
}