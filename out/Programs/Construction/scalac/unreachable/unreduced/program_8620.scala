package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[(Boolean,Char)]]) extends T_A[T_B[T_B[(Byte,Byte)]]]
case class CC_B() extends T_A[T_B[T_B[(Byte,Byte)]]]
case class CC_C(a: T_A[Char]) extends T_A[T_B[T_B[(Byte,Byte)]]]
case class CC_D[C](a: C) extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: T_A[T_B[T_B[(Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)