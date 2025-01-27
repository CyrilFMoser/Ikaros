package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: T_B[Boolean], c: (T_B[Byte],T_A[Byte])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A) extends T_A[T_A[(CC_A,CC_A)]]
case class CC_C() extends T_A[T_A[T_A[Byte]]]
case class CC_D[C](a: CC_B, b: CC_C, c: CC_C) extends T_B[C]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_B(_, _), CC_C(), CC_C()), (CC_D(_, _, _),_)) => 0 
  case CC_C() => 1 
}
}