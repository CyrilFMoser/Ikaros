package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Byte], b: T_A[C, C]) extends T_A[C, Byte]
case class CC_B[D]() extends T_A[D, Byte]
case class CC_C(a: CC_A[T_A[(Byte,Byte), Byte]], b: CC_B[T_A[Char, Byte]], c: CC_A[CC_B[Byte]]) extends T_A[CC_A[CC_B[Int]], Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(), _), _) => 1 
  case CC_A(CC_B(), _) => 2 
  case CC_B() => 3 
}
}