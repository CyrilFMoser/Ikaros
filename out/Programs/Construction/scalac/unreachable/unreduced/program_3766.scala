package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(T_A[Int],(Char,Char))]
case class CC_B(a: CC_A, b: T_A[T_B[CC_A]], c: CC_A) extends T_A[(T_A[Int],(Char,Char))]
case class CC_C(a: T_B[CC_B], b: Byte) extends T_B[CC_B]

val v_a: T_A[(T_A[Int],(Char,Char))] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}