package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[Int, (Boolean,Byte)], T_A[T_B, Int]], b: Boolean) extends T_A[(T_B,T_A[T_B, T_B]), T_B]
case class CC_B() extends T_B
case class CC_C(a: CC_A, b: Char, c: T_A[T_B, T_A[CC_A, Byte]]) extends T_B
case class CC_D(a: T_B, b: T_B, c: Int) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), _, _) => 0 
  case CC_D(CC_C(CC_A(_, _), _, _), _, _) => 1 
  case CC_D(CC_D(_, _, _), _, _) => 2 
}
}