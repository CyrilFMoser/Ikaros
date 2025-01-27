package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_B[T_B[Char, (Byte,Int)], (T_A,T_A)], c: T_A) extends T_A
case class CC_B(a: CC_A, b: T_A, c: T_A) extends T_A
case class CC_C(a: Boolean) extends T_A
case class CC_D[C](a: Boolean, b: (CC_C,T_B[Int, CC_C]), c: Boolean) extends T_B[Boolean, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)