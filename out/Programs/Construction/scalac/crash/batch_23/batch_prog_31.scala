package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B]) extends T_A[B]
case class CC_B(a: T_A[(Boolean,Byte)], b: T_A[T_A[Byte]]) extends T_A[CC_A[T_A[Char]]]

val v_a: T_A[CC_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_B(_, CC_A(CC_A(_, _), CC_A(_, _))) => 2 
}
}