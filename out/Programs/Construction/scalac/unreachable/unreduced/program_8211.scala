package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_A[Char, Char], T_A[Byte, (Boolean,Boolean)]]]
case class CC_B[E](a: ((Int,Boolean),T_B[Int])) extends T_A[E, CC_A[T_A[Boolean, Boolean]]]
case class CC_C() extends T_B[T_A[CC_A[Int], CC_B[Byte]]]
case class CC_D(a: CC_C, b: T_A[(CC_C,CC_C), CC_C], c: (CC_B[CC_C],CC_C)) extends T_B[T_A[CC_A[Int], CC_B[Byte]]]
case class CC_E[F]() extends T_B[F]

val v_a: T_B[T_A[CC_A[Int], CC_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), _, (CC_B(_),CC_C())) => 1 
  case CC_E() => 2 
}
}