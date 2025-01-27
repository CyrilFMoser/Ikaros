package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[(T_A[Boolean, Int],(Byte,Char)), D]
case class CC_B[F, E](a: T_A[F, F], b: T_B[F]) extends T_A[F, E]
case class CC_C() extends T_A[(T_A[Boolean, Int],(Byte,Char)), T_A[T_A[(Boolean,Char), Byte], Byte]]
case class CC_D(a: (CC_B[CC_C, CC_C],CC_C), b: T_A[T_A[CC_C, Int], CC_B[CC_C, Byte]], c: CC_C) extends T_B[((CC_C,CC_C),(CC_C,CC_C))]
case class CC_E(a: CC_B[T_A[CC_D, CC_C], CC_B[CC_D, CC_D]], b: CC_C) extends T_B[((CC_C,CC_C),(CC_C,CC_C))]

val v_a: T_B[((CC_C,CC_C),(CC_C,CC_C))] = null
val v_b: Int = v_a match{
  case CC_D((CC_B(_, _),CC_C()), CC_B(_, _), CC_C()) => 0 
  case CC_E(_, _) => 1 
}
}