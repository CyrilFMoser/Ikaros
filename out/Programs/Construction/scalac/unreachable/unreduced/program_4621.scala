package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_A[Char], b: CC_A, c: T_A[(CC_A,CC_A)]) extends T_A[Byte]
case class CC_C() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_A(_, CC_C()) => 2 
  case CC_B(_, CC_A(_, _), _) => 3 
  case CC_C() => 4 
}
}