package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, C], b: CC_A, c: CC_A) extends T_B[C, T_B[C, C]]
case class CC_D[D]() extends T_B[D, T_B[D, D]]
case class CC_E(a: CC_A, b: T_B[CC_C[CC_B], T_B[CC_C[CC_B], CC_C[CC_B]]], c: Int) extends T_B[CC_C[CC_D[CC_B]], T_B[CC_C[CC_D[CC_B]], CC_C[CC_D[CC_B]]]]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, CC_A(_, _)), CC_C(_, CC_A(_, _), _), 12) => 0 
  case CC_E(CC_A(_, CC_A(_, _)), CC_C(_, CC_A(_, _), _), _) => 1 
  case CC_E(CC_A(_, CC_A(_, _)), CC_D(), 12) => 2 
  case CC_E(CC_A(_, CC_A(_, _)), CC_D(), _) => 3 
  case CC_E(CC_A(_, CC_B()), CC_C(_, CC_A(_, _), _), 12) => 4 
  case CC_E(CC_A(_, CC_B()), CC_C(_, CC_A(_, _), _), _) => 5 
  case CC_E(CC_A(_, CC_B()), CC_D(), 12) => 6 
  case CC_E(CC_A(_, CC_B()), CC_D(), _) => 7 
}
}