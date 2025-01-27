package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[T_A[Byte]], c: T_A[(Char,Byte)]) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: Char, b: T_A[CC_A]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}