package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, Boolean], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: T_B[C, C], b: CC_A) extends T_B[T_A, C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_D(_, _), CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_A(CC_B(), CC_D(_, _), CC_A(_, _, _)), _, _) => 1 
  case CC_A(CC_A(CC_C(_), CC_D(_, _), CC_A(_, _, _)), _, _) => 2 
  case CC_A(CC_A(CC_A(_, _, _), CC_D(_, _), CC_B()), _, _) => 3 
  case CC_A(CC_A(CC_B(), CC_D(_, _), CC_B()), _, _) => 4 
  case CC_A(CC_A(CC_C(_), CC_D(_, _), CC_B()), _, _) => 5 
  case CC_A(CC_A(CC_A(_, _, _), CC_D(_, _), CC_C(_)), _, _) => 6 
  case CC_A(CC_A(CC_B(), CC_D(_, _), CC_C(_)), _, _) => 7 
  case CC_A(CC_A(CC_C(_), CC_D(_, _), CC_C(_)), _, _) => 8 
  case CC_A(CC_B(), _, _) => 9 
  case CC_A(CC_C(CC_B()), _, _) => 10 
}
}