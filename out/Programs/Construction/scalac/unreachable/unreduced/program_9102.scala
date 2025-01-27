package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[(Char,Byte)]]
case class CC_B() extends T_A[T_B[(Char,Byte)]]
case class CC_C[C](a: C, b: T_A[C], c: CC_A) extends T_A[C]
case class CC_D(a: CC_C[CC_B], b: CC_C[T_B[Char]], c: T_A[CC_B]) extends T_B[Char]
case class CC_E(a: CC_C[CC_C[CC_D]], b: CC_D) extends T_B[Char]
case class CC_F() extends T_B[Char]

val v_a: T_A[T_B[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}