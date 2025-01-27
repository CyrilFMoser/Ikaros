package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Byte]
case class CC_B(a: T_A[T_B[CC_A, (Int,Byte)]]) extends T_A[Byte]
case class CC_C(a: Boolean, b: T_A[Byte]) extends T_A[Byte]
case class CC_D[D]() extends T_B[D, T_A[Byte]]
case class CC_E[E](a: Boolean) extends T_B[E, T_A[Byte]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_A()) => 2 
  case CC_C(_, CC_B(_)) => 3 
  case CC_C(_, CC_C(_, CC_A())) => 4 
  case CC_C(_, CC_C(_, CC_B(_))) => 5 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 6 
}
}