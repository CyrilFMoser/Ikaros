package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_A[(Char,Char), T_B])) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C() extends T_A[T_B, CC_A[T_A[T_B, T_B]]]
case class CC_D(a: Byte, b: CC_C) extends T_B

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _),_)) => 0 
  case CC_B() => 1 
}
}