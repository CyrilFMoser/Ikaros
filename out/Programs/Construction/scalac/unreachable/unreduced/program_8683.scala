package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Char,Byte)], b: T_A[Boolean]) extends T_A[T_B[T_B[(Char,Char)]]]
case class CC_B(a: CC_A) extends T_A[T_B[T_B[(Char,Char)]]]
case class CC_C() extends T_B[T_B[T_A[CC_A]]]
case class CC_D(a: T_B[Int], b: T_B[CC_B], c: T_B[T_B[Byte]]) extends T_B[T_B[T_A[CC_A]]]
case class CC_E(a: Char) extends T_B[T_B[T_A[CC_A]]]

val v_a: T_B[T_B[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(_) => 2 
}
}