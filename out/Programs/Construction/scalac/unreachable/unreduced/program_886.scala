package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Byte, C], C], b: Int) extends T_A[C, (T_A[Byte, Byte],Byte)]
case class CC_B[D]() extends T_A[D, (T_A[Byte, Byte],Byte)]

val v_a: T_A[Boolean, (T_A[Byte, Byte],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B() => 2 
}
}