package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Byte,Char)], b: T_A[T_A[Boolean]]) extends T_A[Byte]
case class CC_B[B](a: B) extends T_A[Byte]
case class CC_C() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}