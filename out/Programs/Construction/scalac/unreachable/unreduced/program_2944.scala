package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C], b: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[T_B[Boolean]], b: T_A[CC_A[Int, Boolean]], c: T_A[(Byte,Char)]) extends T_B[T_B[T_B[Int]]]
case class CC_C(a: T_A[CC_B]) extends T_B[T_B[T_B[Int]]]

val v_a: T_B[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _)), CC_A(_, _), CC_A(_, _)) => 0 
  case CC_C(_) => 1 
}
}