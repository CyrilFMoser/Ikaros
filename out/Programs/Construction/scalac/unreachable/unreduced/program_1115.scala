package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Byte],T_B[Char])) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: (CC_A,Int), b: T_B[CC_A], c: Char) extends T_A[T_A[T_B[Byte]]]
case class CC_C(a: T_A[T_A[CC_A]]) extends T_A[T_A[T_B[Byte]]]
case class CC_D[C]() extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)