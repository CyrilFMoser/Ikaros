package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_))) => 1 
  case CC_A(_, CC_B(_)) => 2 
  case CC_B(_) => 3 
}
}