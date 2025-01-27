package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Char]], b: T_B[T_B[Byte, Byte], T_A[Byte]], c: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A, b: T_B[CC_A, (CC_A,CC_A)]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_D[E, D](a: T_B[D, D], b: CC_A) extends T_B[E, D]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_, CC_D(_, _), _)) => 1 
}
}
// This is not matched: CC_A(_, CC_D(CC_D(_, _), CC_A(_, _, _)), _)