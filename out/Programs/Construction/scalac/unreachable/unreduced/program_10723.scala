package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A, c: T_B[T_B[T_A, (Char,Boolean)], T_A]) extends T_A
case class CC_C[C](a: T_B[C, C], b: CC_B) extends T_B[CC_A, C]
case class CC_D[D](a: D) extends T_B[CC_A, D]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A()) => 1 
  case CC_D(CC_B(CC_A(), _, _)) => 2 
}
}