package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: Boolean) extends T_A[D]
case class CC_C(a: CC_A[T_A[Int]]) extends T_B[T_A[T_A[Char]]]
case class CC_D(a: T_B[Byte], b: CC_A[Byte], c: T_A[CC_C]) extends T_B[T_A[T_A[Char]]]
case class CC_E(a: T_A[CC_C], b: (T_A[CC_C],CC_A[CC_D]), c: CC_C) extends T_B[T_A[T_A[Char]]]

val v_a: T_B[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(), CC_A()) => 0 
  case CC_D(_, CC_A(), CC_B(_)) => 1 
  case CC_E(_, _, _) => 2 
}
}
// This is not matched: CC_C(CC_A())