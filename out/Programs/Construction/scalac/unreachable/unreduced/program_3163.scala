package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: C, b: Int, c: T_A) extends T_B[T_A, C]
case class CC_C(a: Boolean) extends T_B[T_A, CC_B[T_B[CC_A, Byte]]]
case class CC_D[D](a: T_B[T_A, D]) extends T_B[D, T_B[CC_A, ((Char,Int),CC_C)]]

val v_a: T_B[T_A, CC_B[T_B[CC_A, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_C(_) => 1 
}
}