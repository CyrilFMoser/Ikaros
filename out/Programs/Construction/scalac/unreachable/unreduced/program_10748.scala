package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(T_B[Char],T_A[Byte])]
case class CC_B(a: T_B[Byte], b: CC_A) extends T_A[(T_B[Char],T_A[Byte])]
case class CC_C(a: CC_A) extends T_B[T_A[T_A[CC_A]]]
case class CC_D(a: CC_C, b: CC_A, c: CC_B) extends T_B[T_A[T_A[CC_A]]]
case class CC_E(a: CC_C, b: CC_A, c: (T_A[Char],CC_C)) extends T_B[T_A[T_A[CC_A]]]

val v_a: T_B[T_A[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_D(CC_C(CC_A()), CC_A(), CC_B(_, _)) => 1 
  case CC_E(CC_C(CC_A()), CC_A(), (_,CC_C(_))) => 2 
}
}