package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: Boolean) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: T_A[T_A[Byte]], b: T_A[Byte], c: T_A[T_A[Byte]]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B() => 2 
  case CC_C(_, _, _) => 3 
}
}