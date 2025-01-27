package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[C]
case class CC_B(a: Boolean, b: (CC_A[Byte],T_A[(Char,Byte)])) extends T_A[CC_A[T_A[Char]]]
case class CC_C(a: T_B[(CC_B,(Byte,Int))], b: T_A[CC_B]) extends T_A[CC_B]
case class CC_D() extends T_B[(T_B[Byte],CC_C)]
case class CC_E(a: (CC_A[CC_C],Byte), b: CC_A[CC_B], c: T_B[T_B[(Byte,Byte)]]) extends T_B[(T_B[Byte],CC_C)]
case class CC_F(a: CC_C, b: CC_E, c: CC_E) extends T_B[(T_B[Byte],CC_C)]

val v_a: T_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_C(_, _))) => 1 
  case CC_A(_, CC_C(_, _)) => 2 
  case CC_C(_, CC_A(CC_B(_, _), CC_A(_, _))) => 3 
  case CC_C(_, CC_A(CC_B(_, _), CC_C(_, _))) => 4 
  case CC_C(_, CC_C(_, CC_A(_, _))) => 5 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 6 
}
}