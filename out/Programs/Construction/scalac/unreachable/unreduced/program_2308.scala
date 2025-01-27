package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Byte]], b: T_A[Byte], c: Char) extends T_A[T_B]
case class CC_B(a: Char, b: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: CC_A, b: T_A[T_A[Byte]]) extends T_A[T_B]
case class CC_D(a: (T_B,Byte), b: CC_A, c: Char) extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(_, CC_C(CC_A(_, _, _), _))