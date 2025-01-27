package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Char, T_A[Char, (Int,Int)]], b: T_B[Byte]) extends T_A[Boolean, T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]]
case class CC_B[E, D]() extends T_A[D, E]
case class CC_C() extends T_A[Boolean, T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]]
case class CC_D(a: CC_B[T_A[CC_A, CC_A], CC_A]) extends T_B[CC_A]
case class CC_E(a: Char) extends T_B[CC_A]

val v_a: T_A[Boolean, T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}