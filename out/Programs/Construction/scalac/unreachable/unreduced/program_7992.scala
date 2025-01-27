package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[Char], b: (T_A[Boolean],T_A[Byte])) extends T_B[T_A[T_A[Int]]]
case class CC_C() extends T_B[T_A[T_A[Int]]]

val v_a: T_B[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _)), (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_C() => 1 
}
}