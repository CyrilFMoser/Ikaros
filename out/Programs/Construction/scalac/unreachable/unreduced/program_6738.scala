package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: ((T_B,Byte),T_A[T_B]), b: Int) extends T_A[T_B]
case class CC_B(a: T_A[T_A[T_B]], b: T_A[(CC_A,T_B)], c: (T_A[T_B],Byte)) extends T_B
case class CC_C() extends T_B
case class CC_D(a: Byte, b: T_A[T_B], c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D(_, CC_A(_, _), _)