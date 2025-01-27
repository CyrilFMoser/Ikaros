package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[F, G](a: T_B[F], b: F) extends T_A[F, G]
case class CC_C() extends T_B[Int]
case class CC_D(a: T_A[T_A[CC_C, CC_C], T_A[Int, Byte]], b: Char) extends T_B[T_B[CC_C]]

val v_a: T_B[T_B[CC_C]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
  case CC_D(CC_B(_, CC_A()), _) => 1 
  case CC_D(CC_B(_, CC_B(_, _)), _) => 2 
}
}