package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Boolean, T_A], c: (T_B[T_A, T_A],T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Byte) extends T_A
case class CC_D[C](a: T_B[C, C], b: C) extends T_B[CC_C, C]
case class CC_E[D](a: T_B[CC_C, D], b: CC_C, c: D) extends T_B[CC_C, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_A(CC_C(_), _, _) => 2 
  case CC_B() => 3 
  case CC_C(_) => 4 
}
}