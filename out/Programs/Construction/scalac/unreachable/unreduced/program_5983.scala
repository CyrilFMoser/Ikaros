package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: ((T_A,Boolean),T_B[T_A, Int])) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A, b: CC_B, c: Byte) extends T_B[C, T_B[C, T_B[C, C]]]

val v_a: CC_D[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_B(_), (_,_)), CC_B(CC_A(_, _)), _) => 0 
  case CC_D(CC_A(CC_C(), (_,_)), CC_B(CC_A(_, _)), _) => 1 
  case CC_D(CC_B(_), CC_B(CC_A(_, _)), _) => 2 
  case CC_D(CC_C(), CC_B(CC_A(_, _)), _) => 3 
}
}
// This is not matched: CC_D(CC_A(CC_A(_, _), (_,_)), CC_B(CC_A(_, _)), _)