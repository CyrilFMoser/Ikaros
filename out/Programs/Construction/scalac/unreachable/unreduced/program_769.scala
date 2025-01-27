package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_A, b: (CC_A,CC_A), c: CC_A) extends T_A
case class CC_C[C](a: T_B[Int, C], b: CC_A, c: CC_B) extends T_B[Int, C]
case class CC_D[D](a: Int, b: (CC_B,T_B[Int, CC_A]), c: D) extends T_B[Int, D]
case class CC_E[E]() extends T_B[Int, E]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), CC_A(_), CC_B(_, _, _)) => 0 
  case CC_C(CC_D(_, _, _), CC_A(_), CC_B(_, _, _)) => 1 
  case CC_C(CC_E(), CC_A(_), CC_B(_, _, _)) => 2 
  case CC_D(_, (_,_), _) => 3 
  case CC_E() => 4 
}
}