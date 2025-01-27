package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: ((Int,Boolean),T_A[Byte, Int]), b: Int) extends T_A[T_A[(Boolean,Byte), T_A[(Int,Boolean), Byte]], Boolean]
case class CC_B(a: T_A[CC_A, (Int,CC_A)]) extends T_A[T_A[(Boolean,Byte), T_A[(Int,Boolean), Byte]], Boolean]
case class CC_C() extends T_A[T_A[(Boolean,Byte), T_A[(Int,Boolean), Byte]], Boolean]

val v_a: T_A[T_A[(Boolean,Byte), T_A[(Int,Boolean), Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
  case CC_C() => 3 
}
}