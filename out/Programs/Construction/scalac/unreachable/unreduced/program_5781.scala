package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte, b: T_A[T_A[T_B[Int]]]) extends T_A[C]
case class CC_B(a: (Int,T_A[Char]), b: T_B[T_A[Byte]], c: (T_A[Int],T_A[Byte])) extends T_B[T_B[T_B[Boolean]]]
case class CC_C(a: (T_B[CC_B],T_B[CC_B]), b: T_A[Byte], c: Char) extends T_B[T_B[T_B[Boolean]]]
case class CC_D(a: CC_B, b: T_A[Int]) extends T_B[T_B[T_B[Boolean]]]

val v_a: T_B[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_B(_, _, _), CC_A(_, CC_A(_, _))) => 1 
}
}
// This is not matched: CC_B(_, _, (CC_A(_, _),CC_A(_, _)))