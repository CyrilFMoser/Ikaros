package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Char]], b: Byte) extends T_A[T_A[T_A[Byte, Byte], T_B[(Byte,Int)]], T_B[T_B[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Byte, Byte], T_B[(Byte,Int)]], T_B[T_B[Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Byte, Byte], T_B[(Byte,Int)]], T_B[T_B[Boolean]]]
case class CC_D(a: (T_B[CC_A],CC_C), b: CC_A, c: T_A[CC_C, T_B[Char]]) extends T_B[CC_A]
case class CC_E(a: CC_D, b: CC_B) extends T_B[CC_A]

val v_a: T_A[T_A[T_A[Byte, Byte], T_B[(Byte,Int)]], T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}