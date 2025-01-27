package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[T_A], c: Boolean) extends T_A
case class CC_C(a: Char) extends T_A
case class CC_D(a: (T_A,CC_B), b: CC_C, c: CC_C) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(_, _, _), _, _) => 2 
  case CC_B(CC_C(_), _, _) => 3 
  case CC_C(_) => 4 
}
}