package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C]) extends T_A[C]
case class CC_B[D](a: Byte) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: (CC_C[Boolean],Byte), b: T_A[T_A[Boolean]], c: CC_B[CC_B[Char]]) extends T_B[T_A[T_A[Byte]]]

val v_a: T_B[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_D((CC_C(),_), CC_A(_, CC_A(_, _)), CC_B(_)) => 0 
  case CC_D((CC_C(),_), CC_A(_, CC_B(_)), CC_B(_)) => 1 
  case CC_D((CC_C(),_), CC_A(_, CC_C()), CC_B(_)) => 2 
  case CC_D((CC_C(),_), CC_B(_), CC_B(_)) => 3 
  case CC_D((CC_C(),_), CC_C(), CC_B(_)) => 4 
}
}