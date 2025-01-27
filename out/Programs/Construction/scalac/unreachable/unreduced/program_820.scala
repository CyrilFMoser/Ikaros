package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Byte],T_B[Int]), b: T_A[Byte]) extends T_A[T_B[T_B[Byte]]]
case class CC_B[C](a: T_A[C], b: C) extends T_A[C]
case class CC_C(a: CC_A, b: CC_A, c: T_A[Byte]) extends T_A[T_B[T_B[Byte]]]
case class CC_D(a: T_A[T_B[Char]], b: CC_C, c: (T_B[Char],T_B[CC_C])) extends T_B[Char]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_C(_, _, _), _) => 2 
  case CC_C(_, CC_A(_, _), CC_B(_, _)) => 3 
}
}
// This is not matched: CC_B(CC_B(_, _), _)