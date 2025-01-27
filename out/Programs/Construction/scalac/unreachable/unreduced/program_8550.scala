package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Int]
case class CC_B() extends T_A[T_A[Int]]
case class CC_C(a: Char, b: Char) extends T_A[T_A[Int]]
case class CC_D(a: (Byte,CC_C), b: T_A[T_A[Int]], c: T_A[T_A[Byte]]) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C('x', _), _) => 0 
  case CC_D(_, CC_C(_, _), _) => 1 
  case CC_E() => 2 
  case CC_F() => 3 
}
}
// This is not matched: CC_D(_, CC_B(), _)