package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: Char) extends T_A[Byte]
case class CC_B(a: T_A[(Char,Int)]) extends T_A[Byte]
case class CC_C() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}