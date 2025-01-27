package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F, G](a: G, b: T_A[F, G], c: T_B[F]) extends T_A[G, F]
case class CC_C() extends T_B[CC_B[CC_A[Byte, Int], T_A[Boolean, Int]]]
case class CC_D(a: CC_A[CC_C, CC_A[CC_C, Int]], b: CC_B[T_A[Int, CC_C], T_A[CC_C, Boolean]], c: CC_C) extends T_B[CC_B[CC_A[Byte, Int], T_A[Boolean, Int]]]
case class CC_E() extends T_B[CC_B[CC_A[Byte, Int], T_A[Boolean, Int]]]

val v_a: T_B[CC_B[CC_A[Byte, Int], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(), CC_B(_, _, _), _) => 1 
  case CC_E() => 2 
}
}