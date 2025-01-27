package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: B) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[Int], b: T_A[(Char,(Boolean,Byte))]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}