package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Int]], b: T_B[T_A[Boolean, Char]]) extends T_A[T_A[Char, T_A[Byte, Byte]], T_A[Int, Boolean]]
case class CC_B(a: T_B[T_A[CC_A, CC_A]], b: Boolean, c: CC_A) extends T_B[T_B[T_A[CC_A, CC_A]]]
case class CC_C(a: T_A[CC_A, CC_A], b: T_B[CC_B], c: T_A[T_B[CC_B], CC_B]) extends T_B[T_B[T_A[CC_A, CC_A]]]
case class CC_D[D](a: CC_A, b: CC_C) extends T_B[D]

val v_a: T_B[T_B[T_A[CC_A, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(CC_D(_, _), _)) => 0 
  case CC_C(_, CC_D(_, CC_C(_, _, _)), _) => 1 
  case CC_D(CC_A(_, _), CC_C(_, CC_D(_, _), _)) => 2 
}
}