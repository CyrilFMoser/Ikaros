package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_B[(Byte,Int)]]) extends T_A[(T_B[Char],T_B[Byte])]
case class CC_B() extends T_A[(T_B[Char],T_B[Byte])]
case class CC_C(a: Boolean) extends T_A[(T_B[Char],T_B[Byte])]
case class CC_D[C](a: CC_C, b: CC_C, c: Int) extends T_B[C]
case class CC_E() extends T_B[Byte]

val v_a: T_A[(T_B[Char],T_B[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(true) => 2 
  case CC_C(false) => 3 
}
}