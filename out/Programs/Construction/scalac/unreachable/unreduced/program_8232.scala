package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Int], b: Byte, c: Boolean) extends T_A
case class CC_B[B](a: B, b: (T_A,CC_A), c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_A, b: Int) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_B(_, (CC_B(_, _, _),CC_A(_, _, _)), CC_A(_, _, _)) => 2 
  case CC_B(_, (CC_C(),CC_A(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_C() => 4 
}
}