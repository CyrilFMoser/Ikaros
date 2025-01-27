package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[Char], c: T_A) extends T_A
case class CC_C[B]() extends T_B[B]
case class CC_D(a: CC_C[CC_B], b: (CC_C[T_A],T_B[CC_B])) extends T_B[CC_C[Int]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
}
}