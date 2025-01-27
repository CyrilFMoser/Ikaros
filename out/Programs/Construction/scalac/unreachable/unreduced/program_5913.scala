package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_A[T_B[Boolean, Char]]) extends T_A[T_B[T_A[Int], T_A[Byte]]]
case class CC_B(a: Int, b: T_A[T_B[CC_A, (Char,Char)]]) extends T_A[T_B[T_A[Int], T_A[Byte]]]
case class CC_C() extends T_A[T_B[T_A[Int], T_A[Byte]]]

val v_a: T_A[T_B[T_A[Int], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}