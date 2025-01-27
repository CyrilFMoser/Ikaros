package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C]() extends T_A
case class CC_C(a: Char, b: T_B[Int, CC_B[CC_A]], c: CC_A) extends T_A
case class CC_D[D](a: CC_B[D], b: T_B[D, Int], c: CC_C) extends T_B[D, Int]
case class CC_E[E](a: E, b: CC_C, c: E) extends T_B[(T_B[Boolean, CC_C],(Byte,T_A)), Int]
case class CC_F[F](a: Byte, b: F, c: T_B[CC_D[F], F]) extends T_B[CC_D[F], F]

val v_a: T_B[(T_B[Boolean, CC_C],(Byte,T_A)), Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), CC_D(CC_B(), CC_D(_, _, _), CC_C(_, _, _)), _) => 0 
  case CC_D(CC_B(), CC_D(CC_B(), CC_E(_, _, _), CC_C(_, _, _)), _) => 1 
  case CC_D(CC_B(), CC_E(_, CC_C(_, _, _), _), _) => 2 
  case CC_E(_, _, _) => 3 
}
}