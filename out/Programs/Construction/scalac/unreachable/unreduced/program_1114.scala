package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[(CC_A,Int), T_B[CC_A, CC_A]], b: T_A) extends T_A
case class CC_C[C](a: CC_B) extends T_B[C, T_A]
case class CC_D[D](a: D) extends T_B[T_B[D, D], D]

val v_a: CC_D[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_D(CC_B(_, _)) => 1 
}
}